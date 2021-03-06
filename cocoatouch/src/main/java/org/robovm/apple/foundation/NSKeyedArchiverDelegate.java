/*
 * Copyright (C) 2014 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSKeyedArchiverDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "archiver:willEncodeObject:")
    NSObject archiver$willEncodeObject$(NSKeyedArchiver archiver, NSObject object);
    @Method(selector = "archiver:didEncodeObject:")
    void archiver$didEncodeObject$(NSKeyedArchiver archiver, NSObject object);
    @Method(selector = "archiver:willReplaceObject:withObject:")
    void archiver$willReplaceObject$withObject$(NSKeyedArchiver archiver, NSObject object, NSObject newObject);
    @Method(selector = "archiverWillFinish:")
    void archiverWillFinish$(NSKeyedArchiver archiver);
    @Method(selector = "archiverDidFinish:")
    void archiverDidFinish$(NSKeyedArchiver archiver);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
