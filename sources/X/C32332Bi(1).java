package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import java.util.Map;

/* renamed from: X.2Bi  reason: invalid class name and case insensitive filesystem */
public final class C32332Bi {
    public static final Object A00(AnonymousClass601 r17, C63893iY r18) {
        Context context;
        Map map;
        C81864oW A03;
        boolean z;
        Integer num;
        AnonymousClass601 r3 = r17;
        C63893iY r2 = r18;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r3);
        AnonymousClass3HX r6 = r3.A00;
        if (r6 != null) {
            context = r6.A00;
        } else {
            context = null;
        }
        if (context != null) {
            Object A0B = C63893iY.A0B(r2, 0);
            A0B.getClass();
            C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            C127397h3 r10 = (C127397h3) A0B;
            C127397h3 r8 = (C127397h3) C63893iY.A0C(r2, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel", A1Z ? 1 : 0);
            Object A09 = C63893iY.A09(r2);
            C04220Ms.A0C(A09, "null cannot be cast to non-null type kotlin.Boolean");
            boolean A1X = AnonymousClass0wJ.A1X(A09);
            Object obj = r10.A04.get(38);
            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Map map2 = (Map) obj;
            C109326jp A0L = r10.A0L(40);
            if (A0L != null) {
                Object A00 = C61043Rr.A00(r3, C63893iY.A01, A0L);
                C04220Ms.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                map = (Map) A00;
            } else {
                map = null;
            }
            AnonymousClass3IA r4 = new AnonymousClass3IA(Boolean.valueOf(r10.A0T(43, A1Z)), r10.A0N(41), map2, map);
            int i = r8.A03;
            if (i == 16542 || i == 16696) {
                A03 = C122117Ki.A03(r8, i);
            } else {
                A03 = null;
            }
            C66833yP r13 = new C66833yP(r4, A03, AnonymousClass77L.A00.A00(context));
            if (r6 != null) {
                C83454rP r22 = r6.A02;
                C04220Ms.A0C(r22, "null cannot be cast to non-null type com.instagram.common.bloks.Host");
                SparseArray clone = r22.AFz().clone();
                C04220Ms.A06(clone);
                if (i == 16696) {
                    FragmentActivity fragmentActivity = (FragmentActivity) C10050he.A00(context, FragmentActivity.class);
                    if (fragmentActivity != null) {
                        Bundle A06 = C18180wK.A06();
                        Object obj2 = clone.get(R.id.bloks_ig_session);
                        if (obj2 != null) {
                            C10300i6 r32 = (C10300i6) obj2;
                            C18180wK.A0w(A06, r32);
                            boolean z2 = false;
                            r13.A00(A06, false);
                            Boolean bool = r13.A02.A00;
                            if (bool != null) {
                                z2 = bool.booleanValue();
                            }
                            if (!A1X || fragmentActivity.isFinishing() || !(fragmentActivity instanceof C81324nb)) {
                                C63863iT A02 = C63863iT.A02(fragmentActivity, A06, r32, ModalActivity.class, "bloks_screen_query");
                                if (z2) {
                                    A02.A0F();
                                }
                                A02.A06 = r13.A07;
                                A02.A0I(fragmentActivity);
                                return null;
                            }
                            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r32);
                            A0Q.A0A(A06, new AnonymousClass1c7());
                            String str = r13.A07;
                            A0Q.A07 = str;
                            A0Q.A09 = str;
                            if (z2) {
                                A0Q.A08();
                            }
                            A0Q.A05();
                            return null;
                        }
                        throw C18210wN.A0W("Attempting to extract missing value. Please ensure that the value is passed to the BloksObjectSet correctly");
                    }
                    throw C18180wK.A0a("Cannot launch a screen query fragment outside a FragmentActivity");
                } else if (i == 16542) {
                    Object obj3 = clone.get(R.id.bloks_ig_session);
                    if (obj3 != null) {
                        C10300i6 r23 = (C10300i6) obj3;
                        C81864oW r9 = r13.A03;
                        C04220Ms.A0C(r9, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenConfig");
                        C66883yU r42 = (C66883yU) r9;
                        IgBloksScreenConfig A0N = C18190wL.A0N(r23);
                        A0N.A01 = r42;
                        A0N.A0Y = C18210wN.A1T((Boolean) clone.get(R.id.bloks_ig_use_prelogin_json_parser));
                        AnonymousClass3IA r62 = r13.A02;
                        A0N.A0P = r62.A01;
                        if (!A1X) {
                            FragmentActivity fragmentActivity2 = (FragmentActivity) C10050he.A00(context, FragmentActivity.class);
                            if (fragmentActivity2 != null) {
                                AnonymousClass1Xb A01 = AnonymousClass1Xb.A01(r42, r13, A0N, r23, r13.A06);
                                if (r42.A0B == AnonymousClass006.A0N) {
                                    C25786Drz A0Q2 = C18180wK.A0Q(fragmentActivity2, A0N.A0C);
                                    A0Q2.A03 = A01;
                                    A0Q2.A0D = A1Z;
                                    String str2 = r13.A07;
                                    A0Q2.A07 = str2;
                                    A0Q2.A09 = AnonymousClass1Xb.__redex_internal_original_name;
                                    Boolean bool2 = r62.A00;
                                    if (bool2 != null && (!bool2.booleanValue())) {
                                        A0Q2.A09(0, 0, 0, 0);
                                    } else if (r42.A0D) {
                                        A0Q2.A09(R.anim.cds_slide_in_right, R.anim.cds_slide_out_left, R.anim.cds_slide_in_right, R.anim.cds_slide_out_left);
                                    }
                                    A0Q2.A05();
                                    Integer num2 = r42.A0A;
                                    if (num2 == null) {
                                        num2 = 32;
                                    }
                                    AnonymousClass4TE r102 = new AnonymousClass4TE(A01, fragmentActivity2, r13, A0N.A08, A0N.A04(), (C82374pW) null, str2, num2.intValue());
                                    Handler A0F = AnonymousClass0wJ.A0F();
                                    A0F.post(new C32931HcN(A0F, A01, r102));
                                    return null;
                                }
                                String str3 = r13.A07;
                                C04220Ms.A0C(r9, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenConfig");
                                Integer num3 = r42.A0A;
                                if (num3 == null) {
                                    num3 = 32;
                                }
                                C63123bZ.A05(A01, fragmentActivity2, r13, A0N.A08, A0N.A04(), (C82374pW) null, str3, num3.intValue());
                                return null;
                            }
                            throw C18180wK.A0a("Cannot open a CDS screen outside a FragmentActivity");
                        }
                        Boolean bool3 = r62.A00;
                        if (bool3 != null) {
                            z = bool3.booleanValue();
                        } else {
                            z = true;
                        }
                        boolean z3 = !z;
                        String str4 = r13.A07;
                        if (z3) {
                            num = AnonymousClass006.A0C;
                        } else {
                            num = r42.A06;
                            if (num == null) {
                                num = AnonymousClass006.A00;
                            }
                            C04220Ms.A09(num);
                        }
                        Integer num4 = r42.A0A;
                        if (num4 == null) {
                            num4 = 32;
                        }
                        C63123bZ.A02(context, r13, r13.A04, A0N.A04(), (C82374pW) null, num, str4, num4.intValue());
                        return null;
                    }
                    throw C18210wN.A0W("Attempting to extract missing value. Please ensure that the value is passed to the BloksObjectSet correctly");
                } else {
                    throw C18190wL.A0a(String.format("No implementation bound to key: %s", C18210wN.A1X(i)));
                }
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        } else {
            throw C18180wK.A0a("Required value was null.");
        }
    }
}
