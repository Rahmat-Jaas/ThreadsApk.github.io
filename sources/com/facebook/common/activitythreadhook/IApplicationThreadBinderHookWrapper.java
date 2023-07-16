package com.facebook.common.activitythreadhook;

import android.app.IApplicationThread;
import com.facebook.common.binderhooker.BinderHook;
import com.facebook.common.binderhooker.IWrappedBinderHook;

public class IApplicationThreadBinderHookWrapper extends BinderHook implements IApplicationThread, IWrappedBinderHook {
    public BinderHook getWrappedBinderHook() {
        return null;
    }
}
