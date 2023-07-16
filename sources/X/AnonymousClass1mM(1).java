package X;

import android.content.Context;

/* renamed from: X.1mM  reason: invalid class name */
public final class AnonymousClass1mM extends AnonymousClass0gG {
    public final /* synthetic */ Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mM(Context context) {
        super(176, 4, false, false);
        this.A00 = context;
    }

    public final void run() {
        try {
            Context context = this.A00;
            AnonymousClass2CO.A00(context, AnonymousClass2CP.A00(context).A01);
        } catch (C32132Ai e) {
            C10450iM.A07("omvp_tos_display_manager: error communicating tos acceptance to appmanager", e);
            AnonymousClass0LU.A0E("TosNoticeDisplayManager", "Error communicating with appmanager", e);
        }
    }
}
