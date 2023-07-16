package X;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: X.74T  reason: invalid class name */
public final class AnonymousClass74T {
    public static final Pattern A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;

    public static final AnonymousClass695 A00(String str) {
        C04220Ms.A0B(str, 0);
        if (str.length() != 0) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (AnonymousClass695 r1 : AnonymousClass695.values()) {
                if (r1 != AnonymousClass695.UNKNOWN) {
                    A0v.add(r1);
                }
            }
            String A012 = C18250wR.A0h("[^\\d+]").A01(str, "");
            if (A012.length() != 0) {
                String A013 = C18250wR.A0h("[^\\d+]").A01(A012, "");
                AnonymousClass695 r12 = AnonymousClass695.VISA;
                if (A0v.contains(r12)) {
                    Pattern pattern = A05;
                    C04220Ms.A08(pattern);
                    if (C18240wQ.A1V(A013, pattern)) {
                        return r12;
                    }
                }
                AnonymousClass695 r13 = AnonymousClass695.MASTER_CARD;
                if (A0v.contains(r13)) {
                    Pattern pattern2 = A03;
                    C04220Ms.A08(pattern2);
                    if (C18240wQ.A1V(A013, pattern2)) {
                        return r13;
                    }
                }
                AnonymousClass695 r14 = AnonymousClass695.AMEX;
                if (A0v.contains(r14)) {
                    Pattern pattern3 = A00;
                    C04220Ms.A08(pattern3);
                    if (C18240wQ.A1V(A013, pattern3)) {
                        return r14;
                    }
                }
                AnonymousClass695 r15 = AnonymousClass695.JCB;
                if (A0v.contains(r15)) {
                    Pattern pattern4 = A02;
                    C04220Ms.A08(pattern4);
                    if (C18240wQ.A1V(A013, pattern4)) {
                        return r15;
                    }
                }
                AnonymousClass695 r16 = AnonymousClass695.DISCOVER;
                if (A0v.contains(r16)) {
                    Pattern pattern5 = A01;
                    C04220Ms.A08(pattern5);
                    if (C18240wQ.A1V(A013, pattern5)) {
                        return r16;
                    }
                }
                AnonymousClass695 r17 = AnonymousClass695.RUPAY;
                if (A0v.contains(r17)) {
                    Pattern pattern6 = A04;
                    C04220Ms.A08(pattern6);
                    if (C18240wQ.A1V(A013, pattern6)) {
                        return r17;
                    }
                }
            }
        }
        return AnonymousClass695.UNKNOWN;
    }

    static {
        String A0V = AnonymousClass00U.A0V("3|", AnonymousClass695.AMEX.A02.pattern(), "[\\d]*");
        String A0V2 = AnonymousClass00U.A0V("6|60|601|64|62|622|622[19]|62212|62292|65|652|6521|653|6531|", AnonymousClass695.DISCOVER.A02.pattern(), "[\\d]*");
        String A0V3 = AnonymousClass00U.A0V("3|35|352|", AnonymousClass695.JCB.A02.pattern(), "[\\d]*");
        String A0V4 = AnonymousClass00U.A0V("5|2|2[2-7]|22[2-9]|27[0-2]|", AnonymousClass695.MASTER_CARD.A02.pattern(), "[\\d]*");
        String A0V5 = AnonymousClass00U.A0V("5|50|508|6|65|652|6521|653|6530|6531|60|", AnonymousClass695.RUPAY.A02.pattern(), "[\\d]*");
        String A0L = AnonymousClass00U.A0L(AnonymousClass695.VISA.A02.pattern(), "[\\d]*");
        A00 = Pattern.compile(A0V);
        A01 = Pattern.compile(A0V2);
        A02 = Pattern.compile(A0V3);
        A03 = Pattern.compile(A0V4);
        A04 = Pattern.compile(A0V5);
        A05 = Pattern.compile(A0L);
    }
}
