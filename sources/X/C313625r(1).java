package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.25r  reason: invalid class name and case insensitive filesystem */
public enum C313625r {
    PHONE("phone"),
    EMAIL("email"),
    SAC("account_linking"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public final String A00;

    /* access modifiers changed from: public */
    C313625r() {
        this.A00 = "facebook";
    }

    /* access modifiers changed from: public */
    C313625r(String str) {
        this.A00 = str;
    }
}
