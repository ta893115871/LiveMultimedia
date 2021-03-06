/*
*   Copyright 2015 Constant Innovations Inc
*
*    Licensed under the Apache License, Version 2.0 (the "License");
*    you may not use this file except in compliance with the License.
*    You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*    Unless required by applicable law or agreed to in writing, software
*    distributed under the License is distributed on an "AS IS" BASIS,
*    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*    See the License for the specific language governing permissions and
*    limitations under the License.
*/
package com.constantinnovationsinc.livemultimedia.handlers;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class VideoEncoderHandler extends Handler {
    public VideoEncoderHandler(Looper myLooper) {
        super(myLooper);
    }
    public void handleMessage(Message msg) {
        if (msg != null) {
            Bundle bundle =  msg.getData();
        }
    }
}