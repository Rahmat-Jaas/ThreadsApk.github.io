package X;

import com.instagram.api.schemas.ProfileTheme;
import com.instagram.groupprofiles.data.GroupProfileCustomizationRepository;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0101000_I2_8;

/* renamed from: X.57T  reason: invalid class name */
public final class AnonymousClass57T extends C62793ak {
    public final GroupProfileCustomizationRepository A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final C86074wE A04;
    public final C86094wG A05;
    public final boolean A06;

    public AnonymousClass57T(GroupProfileCustomizationRepository groupProfileCustomizationRepository, UserSession userSession, String str, String str2, boolean z) {
        Object value;
        AnonymousClass5IH r7;
        boolean z2;
        boolean A0E;
        Integer num;
        boolean z3;
        List list;
        ProfileTheme profileTheme;
        boolean z4;
        boolean z5;
        this.A01 = userSession;
        this.A00 = groupProfileCustomizationRepository;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z;
        C27457Enn A0z = C18190wL.A0z(new AnonymousClass5IH((ProfileTheme) null, AnonymousClass676.Theme, AnonymousClass006.A00, AnonymousClass0ZV.A00, false, false, false, false, false, false));
        this.A04 = A0z;
        this.A05 = A0z;
        do {
            value = A0z.getValue();
            r7 = (AnonymousClass5IH) value;
            z2 = this.A06;
            A0E = C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 36318230572765479L);
            num = r7.A02;
            z3 = r7.A08;
            list = r7.A03;
            profileTheme = r7.A00;
            z4 = r7.A06;
            z5 = r7.A05;
        } while (!A0z.ADi(value, new AnonymousClass5IH(profileTheme, r7.A01, num, list, z3, z4, z5, r7.A07, z2, A0E)));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0101000_I2_8((Object) this, (C146958n9) null, 14), AnonymousClass3J5.A00(this), 3);
    }
}
