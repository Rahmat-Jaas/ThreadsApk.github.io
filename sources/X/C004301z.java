package X;

import com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook;

/* renamed from: X.01z  reason: invalid class name and case insensitive filesystem */
public final class C004301z extends C04580Og {
    public final /* synthetic */ ActivityThreadBinderHooker$ApplicationThreadBinderHook A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C004301z(ActivityThreadBinderHooker$ApplicationThreadBinderHook activityThreadBinderHooker$ApplicationThreadBinderHook) {
        this();
        this.A00 = activityThreadBinderHooker$ApplicationThreadBinderHook;
    }

    public final String A04() {
        String interfaceDescriptor = this.A00.getInterfaceDescriptor();
        if (interfaceDescriptor == null) {
            return "<No desc, likely not hooked>";
        }
        return interfaceDescriptor;
    }

    public C004301z() {
        super(true, false);
    }
}
