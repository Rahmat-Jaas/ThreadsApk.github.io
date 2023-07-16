package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Gl  reason: invalid class name and case insensitive filesystem */
public final class C33632Gl {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        Integer num;
        String str;
        UserSession userSession;
        C38039KHq A00;
        E6U e6u;
        String str2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        Object A0B = C63893iY.A0B(r12, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        Integer[] A002 = AnonymousClass006.A00(2);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = null;
                break;
            }
            num = A002[i];
            if (1 - num.intValue() != 0) {
                str2 = "xar";
            } else {
                str2 = "ccp";
            }
            if (C04220Ms.A0I(str2, A0B)) {
                break;
            }
            i++;
        }
        if (num != null) {
            boolean A01 = AnonymousClass3WF.A01(r12, A1Z ? 1 : 0);
            Object A0C = C63893iY.A0C(r12, "null cannot be cast to non-null type kotlin.String", 2);
            C04220Ms.A0B(A0C, 0);
            for (Integer num2 : AnonymousClass006.A00(2)) {
                if (1 - num2.intValue() != 0) {
                    str = "is_set_to_all_reels";
                } else {
                    str = "is_set_to_this_reel";
                }
                if (C04220Ms.A0I(str, A0C)) {
                    C10300i6 A0F = C63913ic.A0F(r11);
                    if ((A0F instanceof UserSession) && (userSession = (UserSession) A0F) != null) {
                        if (num2 == AnonymousClass006.A00) {
                            int intValue = num.intValue();
                            if (intValue == 0) {
                                AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
                                if (A01) {
                                    A03.A04(false);
                                    A03.A05(A1Z);
                                } else {
                                    A03.A04(false);
                                    A03.A05(false);
                                }
                            } else if (intValue == A1Z) {
                                AnonymousClass3ZL A032 = AnonymousClass3Zu.A03(userSession);
                                if (A01) {
                                    A032.A05(false);
                                    A032.A04(A1Z);
                                } else {
                                    A032.A05(false);
                                    A032.A04(false);
                                }
                            }
                            A00 = AnonymousClass3LY.A00(userSession);
                            e6u = new E6U(num, num2, A01, false);
                        } else {
                            A00 = AnonymousClass3LY.A00(userSession);
                            e6u = new E6U(num, num2, A01, A01);
                        }
                        A00.A04(e6u);
                    }
                    return null;
                }
            }
            throw C18190wL.A0a("Required value was null.");
        }
        throw C18190wL.A0a("Required value was null.");
    }
}
