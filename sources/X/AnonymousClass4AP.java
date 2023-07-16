package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.4AP  reason: invalid class name */
public final class AnonymousClass4AP implements C39549KvX {
    public final AnonymousClass3US A00;

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        if (c2r != null && jnx != null && c2r.BLJ(jnx) == AnonymousClass006.A00) {
            Object obj = jnx.A02;
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.SwitchItem");
            AnonymousClass3US r3 = this.A00;
            boolean z = ((AnonymousClass4MC) obj).A0C;
            USLEBaseShape0S0000000 A0K = USLEBaseShape0S0000000.A0K(r3.A00);
            AnonymousClass3US.A00(A0K, r3, "view_component");
            C18190wL.A1I(A0K, "ig_message_settings");
            A0K.A0Q("source_of_truth_toggle_value", Boolean.valueOf(z));
            C18230wP.A1E(A0K);
        }
    }

    public AnonymousClass4AP(AnonymousClass3US r1) {
        this.A00 = r1;
    }
}
