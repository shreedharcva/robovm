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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFCharacterSet/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFCharacterSetPtr extends Ptr<CFCharacterSet, CFCharacterSetPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFCharacterSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFCharacterSet() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFCharacterSetGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CFCharacterSetGetPredefined")
    public static native CFCharacterSet getPredefined(CFCharacterSetPredefinedSet theSetIdentifier);
    @Bridge(symbol="CFCharacterSetCreateWithCharactersInRange")
    public static native CFCharacterSet createWithCharactersInRange(CFAllocator alloc, @ByVal CFRange theRange);
    @Bridge(symbol="CFCharacterSetCreateWithCharactersInString")
    public static native CFCharacterSet createWithCharactersInString(CFAllocator alloc, CFString theString);
    @Bridge(symbol="CFCharacterSetCreateWithBitmapRepresentation")
    public static native CFCharacterSet createWithBitmapRepresentation(CFAllocator alloc, CFData theData);
    @Bridge(symbol="CFCharacterSetCreateInvertedSet")
    public static native CFCharacterSet createInvertedSet(CFAllocator alloc, CFCharacterSet theSet);
    @Bridge(symbol="CFCharacterSetIsSupersetOfSet")
    public native boolean isSupersetOfSet(CFCharacterSet theOtherset);
    @Bridge(symbol="CFCharacterSetHasMemberInPlane")
    public native boolean hasMemberInPlane(@MachineSizedSInt long thePlane);
    @Bridge(symbol="CFCharacterSetCreateCopy")
    public static native CFCharacterSet createCopy(CFAllocator alloc, CFCharacterSet theSet);
    @Bridge(symbol="CFCharacterSetIsCharacterMember")
    public native boolean isCharacterMember(short theChar);
    @Bridge(symbol="CFCharacterSetIsLongCharacterMember")
    public native boolean isLongCharacterMember(int theChar);
    @Bridge(symbol="CFCharacterSetCreateBitmapRepresentation")
    public static native CFData createBitmapRepresentation(CFAllocator alloc, CFCharacterSet theSet);
    /*</methods>*/
}
