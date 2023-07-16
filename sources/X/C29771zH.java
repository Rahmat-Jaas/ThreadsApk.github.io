package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.1zH  reason: invalid class name and case insensitive filesystem */
public enum C29771zH {
    A03("publish_actions"),
    A01("email"),
    A05(new String[0]),
    A04("manage_pages", "publish_actions", "publish_pages"),
    A02("manage_pages", "publish_actions", "publish_pages", "email");
    
    public List A00;

    /* access modifiers changed from: public */
    static {
        A03 = new C29771zH(0, "PUBLISH_AS_SELF", "publish_actions");
        A01 = new C29771zH(1, "EMAIL_READ_ONLY", "email");
        A05 = new C29771zH(2, "READ_ONLY", new String[0]);
        A04 = new C29771zH(3, "PUBLISH_AS_SELF_OR_MANAGED_PAGE", "manage_pages", "publish_actions", "publish_pages");
        A02 = new C29771zH(4, "FXCAL", "manage_pages", "publish_actions", "publish_pages", "email");
    }

    /* access modifiers changed from: public */
    C29771zH(String... strArr) {
        this.A00 = C06750aI.A17(Arrays.copyOf(strArr, strArr.length));
    }
}
