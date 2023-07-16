package X;

import android.util.Patterns;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.instagram.barcelona.profile.editor.data.EditProfileRepositoryProfileEditorImpl;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16;

/* renamed from: X.58X  reason: invalid class name */
public final class AnonymousClass58X extends C62793ak implements C146568mS {
    public final EditProfileRepositoryProfileEditorImpl A00;
    public final C86074wE A01;
    public final C86094wG A02;

    public /* synthetic */ AnonymousClass58X(UserSession userSession) {
        EditProfileRepositoryProfileEditorImpl editProfileRepositoryProfileEditorImpl = (EditProfileRepositoryProfileEditorImpl) userSession.A01(EditProfileRepositoryProfileEditorImpl.class, new KtLambdaShape36S0100000_I2_16(userSession, 0));
        C04220Ms.A0B(editProfileRepositoryProfileEditorImpl, 2);
        this.A00 = editProfileRepositoryProfileEditorImpl;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0130000_I2((AnonymousClass5Im) null, (DefaultConstructorMarker) null, 15, 0, false, false, false));
        this.A01 = A0z;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 27), AnonymousClass3J5.A00(this), 3);
        this.A02 = C18230wP.A0x((C148838sG) null, A0z);
    }

    public final void BPP(AnonymousClass688 r14) {
        Object value;
        KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2;
        C04220Ms.A0B(r14, 0);
        C86074wE r3 = this.A01;
        do {
            value = r3.getValue();
            ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
        } while (!C86114wI.A1X(ktCSuperShape0S0130000_I2, AnonymousClass5Im.A00((KtCSuperShape0S2000000_I2) null, (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00, (AnonymousClass6NY) null, AnonymousClass006.A01, (String) null, (String) null, (String) null, StringTreeSet.MAX_SYMBOL_COUNT, false), value, r3));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2((Object) r14, (Object) this, (C146958n9) null, 10), AnonymousClass3J5.A00(this), 3);
    }

    public final void C8h(AnonymousClass688 r9) {
        Object obj;
        Object obj2;
        Object value;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        int A04 = C18230wP.A04(r9, 0);
        if (A04 != 2) {
            if (A04 == 1) {
                obj = ((AnonymousClass5Im) this.A00.A05.getValue()).A03;
                obj2 = C86144wL.A0T(this.A02).A03;
            }
            do {
            } while (!C86104wH.A1Z(this.A01));
        }
        obj = ((AnonymousClass5Im) this.A00.A05.getValue()).A00;
        obj2 = C86144wL.A0T(this.A02).A00;
        if (!C04220Ms.A0I(obj, obj2)) {
            C86074wE r6 = this.A01;
            do {
                value = r6.getValue();
                KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
                r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
                z = ktCSuperShape0S0130000_I2.A03;
                z2 = ktCSuperShape0S0130000_I2.A01;
                C04220Ms.A0B(r3, 0);
            } while (!r6.ADi(value, new KtCSuperShape0S0130000_I2(r3, z, true, z2)));
            return;
        }
        do {
        } while (!C86104wH.A1Z(this.A01));
    }

    public final void CIF(AnonymousClass688 r9) {
        String str;
        Object value;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        if (C18230wP.A04(r9, 0) != 2 || (str = C86144wL.A0T(this.A02).A00.A01) == null || str.length() == 0 || C18240wQ.A1V(str, Patterns.WEB_URL)) {
            EditProfileRepositoryProfileEditorImpl editProfileRepositoryProfileEditorImpl = this.A00;
            Object obj = ((KtCSuperShape0S0130000_I2) this.A02.getValue()).A00;
            C04220Ms.A0B(obj, 0);
            editProfileRepositoryProfileEditorImpl.A03.CrC(obj);
            do {
            } while (!C86104wH.A1Z(this.A01));
            return;
        }
        C86074wE r6 = this.A01;
        do {
            value = r6.getValue();
            KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
            r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
            z = ktCSuperShape0S0130000_I2.A02;
            z2 = ktCSuperShape0S0130000_I2.A01;
            C04220Ms.A0B(r3, 0);
        } while (!r6.ADi(value, new KtCSuperShape0S0130000_I2(r3, true, z, z2)));
    }

    public final void CiG(String str) {
        Object value;
        KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2;
        C86074wE r3 = this.A01;
        do {
            value = r3.getValue();
            ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
        } while (!C86114wI.A1X(ktCSuperShape0S0130000_I2, AnonymousClass5Im.A00((KtCSuperShape0S2000000_I2) null, (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00, (AnonymousClass6NY) null, (Integer) null, (String) null, (String) null, str, 247, false), value, r3));
    }

    public final C86094wG BJA() {
        return this.A02;
    }

    public final void CeR() {
        Object value;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        C86074wE r6 = this.A01;
        do {
            value = r6.getValue();
            KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
            r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
            z = ktCSuperShape0S0130000_I2.A03;
            z2 = ktCSuperShape0S0130000_I2.A01;
            C04220Ms.A0B(r3, 0);
        } while (!r6.ADi(value, new KtCSuperShape0S0130000_I2(r3, z, false, z2)));
    }

    public final void CeT() {
        Object value;
        AnonymousClass5Im r3;
        boolean z;
        boolean z2;
        C86074wE r6 = this.A01;
        do {
            value = r6.getValue();
            KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
            r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
            z = ktCSuperShape0S0130000_I2.A02;
            z2 = ktCSuperShape0S0130000_I2.A01;
            C04220Ms.A0B(r3, 0);
        } while (!r6.ADi(value, new KtCSuperShape0S0130000_I2(r3, false, z, z2)));
    }

    public final void CmZ(String str) {
        do {
        } while (!AnonymousClass5Im.A01(str, this.A01));
    }
}
