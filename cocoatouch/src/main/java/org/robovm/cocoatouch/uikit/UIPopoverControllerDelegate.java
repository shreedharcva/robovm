/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPopoverControllerDelegate_protocol/Reference/Reference.html">UIPopoverControllerDelegate Protocol Reference</a>
 *   @since Available in iOS 3.2 and later.
 * </div>
 */
@Protocol
public interface /*<name>*/ UIPopoverControllerDelegate /*</name>*/ /*<implements>*/ /*</implements>*/ {

    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPopoverControllerDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UIPopoverControllerDelegate/popoverControllerDidDismissPopover:">- (void)popoverControllerDidDismissPopover:(UIPopoverController *)popoverController</a>
     * @since Available in iOS 3.2 and later.
     */
    @Bind("popoverControllerDidDismissPopover:") @Type("void") void didDismissPopover(@Type("UIPopoverController *") UIPopoverController popoverController);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIPopoverControllerDelegate_protocol/Reference/Reference.html#//apple_ref/occ/intfm/UIPopoverControllerDelegate/popoverControllerShouldDismissPopover:">- (BOOL)popoverControllerShouldDismissPopover:(UIPopoverController *)popoverController</a>
     * @since Available in iOS 3.2 and later.
     */
    @Bind("popoverControllerShouldDismissPopover:") @Type("BOOL") boolean shouldDismissPopover(@Type("UIPopoverController *") UIPopoverController popoverController);
    /*</methods>*/

}