package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.1mE  reason: invalid class name */
public final class AnonymousClass1mE extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass493 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mE(AnonymousClass493 r2) {
        super(1107014530);
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass493 r2 = this.A00;
        String str = r2.A05;
        boolean A0I = C04220Ms.A0I(r2.A03, C18180wK.A0Y());
        String str2 = r2.A04;
        try {
            C559235c r4 = r2.A09;
            Boolean valueOf = Boolean.valueOf(A0I);
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            if (str2 != null) {
                A0K.A0d("emoji", str2);
            }
            if (valueOf != null) {
                A0K.A0e("enabled", A0I);
            }
            if (str != null) {
                A0K.A0d("welcome_message_text", str);
            }
            C18180wK.A0v(r4.A00.edit(), "messaging_settings_welcome_message_item", C18180wK.A0h(A0K, A0d));
        } catch (IOException e) {
            C10450iM.A06("DirectWelcomeMessageSettingManager", "Error while serializing WelcomeMessageItem", e);
        }
    }
}
