package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2;

/* renamed from: X.7vr  reason: invalid class name and case insensitive filesystem */
public final class C133537vr implements C27827Etw {
    public final /* synthetic */ AnonymousClass5xd A00;

    public C133537vr(AnonymousClass5xd r1) {
        this.A00 = r1;
    }

    public final void BjG(String str) {
        if (C04220Ms.A0I(str, "onboard_banner_start_button_tag")) {
            C62793ak A0N = C18200wM.A0N(this.A00.A08);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(A0N, (C146958n9) null, 44), AnonymousClass3J5.A00(A0N), 3);
        }
    }

    public final void BmF(String str) {
        if (C04220Ms.A0I(str, "non_recorded_gifters_disclaimer_dismiss_tag")) {
            AnonymousClass5xd r1 = this.A00;
            AnonymousClass58E r3 = (AnonymousClass58E) r1.A08.getValue();
            String string = r1.requireArguments().getString("arg_media_id");
            if (string != null) {
                Object value = r3.A06.getValue();
                if (value instanceof AnonymousClass5LQ) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1201000_I2(r3, value, string, (C146958n9) null, 1), AnonymousClass3J5.A00(r3), 3);
                    return;
                }
                throw C18180wK.A0a("[appreciation gift feed] illegal view state");
            }
            throw AnonymousClass0wJ.A0b();
        }
    }
}
