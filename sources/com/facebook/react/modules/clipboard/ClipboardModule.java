package com.facebook.react.modules.clipboard;

import X.C145858lE;
import X.C18200wM;
import X.IPD;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Clipboard")
public class ClipboardModule extends NativeClipboardSpec {
    public void setString(String str) {
        getClipboardService().setPrimaryClip(ClipData.newPlainText((CharSequence) null, str));
    }

    private ClipboardManager getClipboardService() {
        IPD reactApplicationContext = getReactApplicationContext();
        getReactApplicationContext();
        return (ClipboardManager) reactApplicationContext.getBaseContext().getSystemService("clipboard");
    }

    public void getString(C145858lE r5) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip != null) {
                if (primaryClip.getItemCount() >= 1) {
                    ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append("");
                    r5.resolve(C18200wM.A0m(itemAt.getText(), A0r));
                    return;
                }
            }
            r5.resolve("");
        } catch (Exception e) {
            r5.reject(e);
        }
    }

    public ClipboardModule(IPD ipd) {
        super(ipd);
    }
}
