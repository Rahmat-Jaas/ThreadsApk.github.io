package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1301000_I2;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;

/* renamed from: X.7GG  reason: invalid class name */
public final class AnonymousClass7GG {
    public static final C148878sK A00 = AnonymousClass7C0.A02(AnonymousClass5I9.A07, AnonymousClass5I9.A09, AnonymousClass5I9.A06, AnonymousClass5I9.A05, AnonymousClass5I9.A08);

    public static final void A01(AnonymousClass7KG r3, AnonymousClass5I9 r4) {
        String str = r4.A04.A01;
        C04220Ms.A0B(str, 0);
        if (AnonymousClass7KG.A07(r3, AnonymousClass00U.A0L("android-app://androidx.navigation/", str).hashCode(), false, false)) {
            AnonymousClass7KG.A06(r3);
        }
    }

    public static final void A02(AnonymousClass7KG r4, AnonymousClass5I9 r5, boolean z) {
        r4.A0G(C98436Fn.A00(new KtLambdaShape5S0110000_I2(13, r4, z)), new C124977cD(true), r5.A04.A01);
    }

    public static final void A00(C147188nY r49, C147368pE r50, Modifier modifier, AnonymousClass06E r52, C146638ma r53, C882257f r54, AnonymousClass0ZU r55, AnonymousClass0ZU r56, AnonymousClass0ZU r57, AnonymousClass0ZU r58, AnonymousClass0YY r59, AnonymousClass0YY r60, AnonymousClass0YY r61, AnonymousClass0YY r62, AnonymousClass0YY r63, int i, int i2, int i3) {
        int i4;
        Object obj;
        AnonymousClass7AO r2;
        Modifier modifier2 = modifier;
        C882257f r5 = r54;
        C146638ma r13 = r53;
        AnonymousClass06E r47 = r52;
        boolean A1Z = AnonymousClass0wJ.A1Z(r47, r13);
        C147368pE r48 = r50;
        C04220Ms.A0B(r48, 2);
        AnonymousClass0YY r42 = r59;
        AnonymousClass0ZU r46 = r55;
        AnonymousClass0wJ.A1R(r46, r42);
        AnonymousClass0YY r35 = r60;
        C04220Ms.A0B(r35, 5);
        AnonymousClass0YY r41 = r61;
        AnonymousClass0ZU r44 = r57;
        AnonymousClass0ZU r45 = r56;
        C18180wK.A1S(r45, r41, r44);
        AnonymousClass0ZU r43 = r58;
        AnonymousClass0YY r39 = r63;
        AnonymousClass0YY r40 = r62;
        C86104wH.A1Q(r40, r43, r39);
        C147188nY r1 = r49;
        r1.Cvd(-927820036);
        int i5 = i3;
        if ((i5 & 4096) != 0) {
            modifier2 = Modifier.A00;
        }
        int i6 = i2;
        if ((i5 & 8192) != 0) {
            C124247ak r22 = new C124247ak(AnonymousClass7CZ.A00(r1));
            AnonymousClass06C A002 = AnonymousClass7CD.A00(r1);
            if (A002 != null) {
                C62793ak A003 = C98396Fj.A00(r1, r22, A002, C86104wH.A0J(A002), C882257f.class, (String) null);
                AnonymousClass7W3.A0z(r1, false);
                r5 = (C882257f) A003;
                i4 = i6 & -7169;
            } else {
                throw C18180wK.A0a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            i4 = i6;
        }
        UserSession userSession = (UserSession) AnonymousClass7CZ.A01(r1);
        Context context = (Context) C147188nY.A0o(r1);
        C81784oM A01 = AnonymousClass7Aj.A01(r1, r5.A01);
        AnonymousClass59F A004 = AnonymousClass6ND.A00(r1);
        C884958x A005 = AnonymousClass6NC.A00(r1, userSession, new C114586tX[]{A004});
        C04220Ms.A0B(A005, 0);
        r1.Cvb(-120375203);
        C81784oM A006 = AnonymousClass7Aj.A00(r1, (Object) null, (C27952Ew2) null, A005.A0N, 2);
        AnonymousClass7W3 r8 = (AnonymousClass7W3) r1;
        boolean A0y = C147188nY.A0y(r1, AnonymousClass7W3.A06(r8, A006));
        Object A13 = r8.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            AnonymousClass8AL r23 = A005.A0M;
            ListIterator listIterator = r23.listIterator(r23.size());
            loop0:
            while (true) {
                A13 = null;
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                C123917Zx r12 = (C123917Zx) obj;
                C148878sK<AnonymousClass5I9> r3 = A00;
                if (!(r3 instanceof Collection) || !r3.isEmpty()) {
                    for (AnonymousClass5I9 r24 : r3) {
                        if (C04220Ms.A0I(r24.A04.A01, r12.A03.A02)) {
                            break loop0;
                        }
                    }
                    continue;
                }
            }
            C123917Zx r6 = (C123917Zx) obj;
            if (!(r6 == null || (r2 = r6.A03) == null)) {
                A13 = r2.A02;
            }
            r8.A14(A13);
        }
        AnonymousClass7W3.A0w(r8, false);
        String str = (String) A13;
        boolean A10 = C147188nY.A10(r1, A005, r13, 511388516);
        Object A132 = r8.A13();
        if (A10 || A132 == AnonymousClass7GN.A00) {
            A132 = new C130247oz(A005, r13);
            r8.A14(A132);
        }
        AnonymousClass7W3.A0w(r8, false);
        AnonymousClass7K5.A05(r1, Unit.A00, new KtSLambdaShape0S1301000_I2((Object) r48, (Object) A005, (Object) A006, str, (C146958n9) null, A1Z ? 1 : 0));
        int i7 = i;
        C147188nY r21 = r1;
        AnonymousClass6NE.A00(r21, (Modifier) null, (C142918fo) null, A004, AnonymousClass7JR.A00(r1, new AnonymousClass8UQ(context, A01, A006, modifier2, r47, A005, (C130247oz) A132, A004, userSession, str, r45, r44, r43, r46, r40, r41, r42, r39, r35, i7, i4), 72299895), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 12582920, 126, 0, 0, 0);
        C147178nW AKE = r1.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8UC(r48, modifier2, r47, r13, r5, r46, r45, r44, r43, r42, r35, r41, r40, r39, i7, i6, i5));
        }
    }
}
