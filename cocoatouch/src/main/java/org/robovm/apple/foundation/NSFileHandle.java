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
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileHandle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSFileHandlePtr extends Ptr<NSFileHandle, NSFileHandlePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFileHandle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSFileHandle() {}
    protected NSFileHandle(SkipInit skipInit) { super(skipInit); }
    public NSFileHandle(int fd, boolean closeopt) { super((SkipInit) null); initObject(initWithFileDescriptor$closeOnDealloc$(fd, closeopt)); }
    public NSFileHandle(int fd) { super((SkipInit) null); initObject(initWithFileDescriptor$(fd)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "readabilityHandler")
    public native ObjCBlock getReadabilityHandler();
    @Property(selector = "setReadabilityHandler:")
    public native void setReadabilityHandler(ObjCBlock v);
    @Property(selector = "writeabilityHandler")
    public native ObjCBlock getWriteabilityHandler();
    @Property(selector = "setWriteabilityHandler:")
    public native void setWriteabilityHandler(ObjCBlock v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSFileHandleReadCompletionNotification")
    public static native String NotificationReadCompletion();
    @GlobalValue(symbol="NSFileHandleReadToEndOfFileCompletionNotification")
    public static native String NotificationReadToEndOfFileCompletion();
    @GlobalValue(symbol="NSFileHandleConnectionAcceptedNotification")
    public static native String NotificationConnectionAccepted();
    @GlobalValue(symbol="NSFileHandleDataAvailableNotification")
    public static native String NotificationDataAvailable();
    @GlobalValue(symbol="NSFileHandleNotificationDataItem")
    public static native String NotificationDataItem();
    @GlobalValue(symbol="NSFileHandleNotificationFileHandleItem")
    public static native String NotificationFileHandleItem();
    @GlobalValue(symbol="NSFileHandleNotificationMonitorModes")
    public static native String NotificationMonitorModes();
    
    @Method(selector = "availableData")
    public native NSData availableData();
    @Method(selector = "readDataToEndOfFile")
    public native NSData readDataToEndOfFile();
    @Method(selector = "readDataOfLength:")
    public native NSData readDataOfLength$(@MachineSizedUInt long length);
    @Method(selector = "writeData:")
    public native void writeData$(NSData data);
    @Method(selector = "offsetInFile")
    public native long offsetInFile();
    @Method(selector = "seekToEndOfFile")
    public native long seekToEndOfFile();
    @Method(selector = "seekToFileOffset:")
    public native void seekToFileOffset$(long offset);
    @Method(selector = "truncateFileAtOffset:")
    public native void truncateFileAtOffset$(long offset);
    @Method(selector = "synchronizeFile")
    public native void synchronizeFile();
    @Method(selector = "closeFile")
    public native void closeFile();
    @Method(selector = "fileHandleWithStandardInput")
    public static native NSObject fileHandleWithStandardInput();
    @Method(selector = "fileHandleWithStandardOutput")
    public static native NSObject fileHandleWithStandardOutput();
    @Method(selector = "fileHandleWithStandardError")
    public static native NSObject fileHandleWithStandardError();
    @Method(selector = "fileHandleWithNullDevice")
    public static native NSObject fileHandleWithNullDevice();
    @Method(selector = "fileHandleForReadingAtPath:")
    public static native NSObject fileHandleForReadingAtPath$(String path);
    @Method(selector = "fileHandleForWritingAtPath:")
    public static native NSObject fileHandleForWritingAtPath$(String path);
    @Method(selector = "fileHandleForUpdatingAtPath:")
    public static native NSObject fileHandleForUpdatingAtPath$(String path);
    @Method(selector = "fileHandleForReadingFromURL:error:")
    public static native NSObject fileHandleForReadingFromURL$error$(NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "fileHandleForWritingToURL:error:")
    public static native NSObject fileHandleForWritingToURL$error$(NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "fileHandleForUpdatingURL:error:")
    public static native NSObject fileHandleForUpdatingURL$error$(NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "readInBackgroundAndNotifyForModes:")
    public native void readInBackgroundAndNotifyForModes$(NSArray<?> modes);
    @Method(selector = "readInBackgroundAndNotify")
    public native void readInBackgroundAndNotify();
    @Method(selector = "readToEndOfFileInBackgroundAndNotifyForModes:")
    public native void readToEndOfFileInBackgroundAndNotifyForModes$(NSArray<?> modes);
    @Method(selector = "readToEndOfFileInBackgroundAndNotify")
    public native void readToEndOfFileInBackgroundAndNotify();
    @Method(selector = "acceptConnectionInBackgroundAndNotifyForModes:")
    public native void acceptConnectionInBackgroundAndNotifyForModes$(NSArray<?> modes);
    @Method(selector = "acceptConnectionInBackgroundAndNotify")
    public native void acceptConnectionInBackgroundAndNotify();
    @Method(selector = "waitForDataInBackgroundAndNotifyForModes:")
    public native void waitForDataInBackgroundAndNotifyForModes$(NSArray<?> modes);
    @Method(selector = "waitForDataInBackgroundAndNotify")
    public native void waitForDataInBackgroundAndNotify();
    @Method(selector = "initWithFileDescriptor:closeOnDealloc:")
    protected native @Pointer long initWithFileDescriptor$closeOnDealloc$(int fd, boolean closeopt);
    @Method(selector = "initWithFileDescriptor:")
    protected native @Pointer long initWithFileDescriptor$(int fd);
    @Method(selector = "fileDescriptor")
    public native int fileDescriptor();
    /*</methods>*/
}
