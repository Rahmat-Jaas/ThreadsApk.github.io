package X;

import android.content.SharedPreferences;
import com.facebook.realtime.requeststream.client.SandboxConfigSource;

/* renamed from: X.40l  reason: invalid class name and case insensitive filesystem */
public final class C677640l implements SandboxConfigSource {
    public final SharedPreferences A00;

    public static synchronized SandboxConfigSource A00() {
        SandboxConfigSource sandboxConfigSource;
        Class<C677640l> cls = C677640l.class;
        synchronized (cls) {
            sandboxConfigSource = (SandboxConfigSource) C10260hz.A00.A01(cls, C73764Ua.A00);
        }
        return sandboxConfigSource;
    }

    public final String getBladerunnerSandbox() {
        return C18200wM.A0h(this.A00, "bladerunnerSandbox");
    }

    public final String getDistillerySandbox() {
        return C18200wM.A0h(this.A00, "distillerySandbox");
    }

    public final String getJavascriptSandbox() {
        return C18200wM.A0h(this.A00, "javascriptSandbox");
    }

    public final String getWwwSandbox() {
        return C18200wM.A0h(this.A00, "wwwSandbox");
    }

    public final void setBladerunnerSandbox(String str) {
        this.A00.edit().putString("bladerunnerSandbox", str).commit();
    }

    public final void setDistillerySandbox(String str) {
        this.A00.edit().putString("distillerySandbox", str).commit();
    }

    public final void setJavascriptSandbox(String str) {
        this.A00.edit().putString("javascriptSandbox", str).commit();
    }

    public final void setWwwSandbox(String str) {
        this.A00.edit().putString("wwwSandbox", str).commit();
    }

    public C677640l(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }
}
