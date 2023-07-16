package X;

import com.instagram.api.schemas.DayOfTheWeek;
import com.instagram.service.session.UserSession;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.3gy  reason: invalid class name and case insensitive filesystem */
public final class C63193gy {
    public static final C84444t9 A01(UserSession userSession) {
        Integer BDN;
        C04220Ms.A0B(userSession, 0);
        List<C84444t9> A02 = C62803am.A02(userSession);
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - (AnonymousClass0wJ.A0A() / 1000);
        if (A02 != null) {
            for (C84444t9 r4 : A02) {
                if (!(r4 == null || (BDN = r4.BDN()) == null)) {
                    int intValue = BDN.intValue();
                    Integer Afm = r4.Afm();
                    if (Afm != null) {
                        int intValue2 = Afm.intValue();
                        if (((long) intValue) <= currentTimeMillis && currentTimeMillis <= ((long) intValue2) && A04(r4)) {
                            return r4;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static final C84444t9 A02(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        List<C84444t9> A02 = C62803am.A02(userSession);
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - (AnonymousClass0wJ.A0A() / 1000);
        C84444t9 r7 = null;
        if (A02 != null) {
            for (C84444t9 r5 : A02) {
                if (r5 != null) {
                    if (r7 != null) {
                        Integer BDN = r5.BDN();
                        Integer BDN2 = r7.BDN();
                        if (!(BDN == null || BDN2 == null)) {
                            int intValue = BDN.intValue();
                            if (currentTimeMillis < ((long) intValue)) {
                                if (intValue < BDN2.intValue()) {
                                    if (!A04(r5)) {
                                    }
                                }
                            }
                        }
                    }
                    r7 = r5;
                }
            }
        }
        return r7;
    }

    public static final Integer A03(C84444t9 r9, UserSession userSession) {
        String Aqv;
        Integer Afm;
        List<C84444t9> A02;
        Integer BDN;
        List AcG;
        C04220Ms.A0B(userSession, 0);
        Integer Afm2 = r9.Afm();
        if (!(Afm2 == null || ((long) Afm2.intValue()) != 86399 || (Aqv = r9.Aqv()) == null || (Afm = r9.Afm()) == null)) {
            int intValue = Afm.intValue();
            if (!(r9.BDN() == null || r9.AcG() == null || ((long) intValue) != 86399 || (A02 = C62803am.A02(userSession)) == null)) {
                Calendar instance = Calendar.getInstance();
                instance.add(5, 1);
                int i = instance.get(7);
                for (C84444t9 r4 : A02) {
                    String Aqv2 = r4.Aqv();
                    if (!(Aqv2 == null || (BDN = r4.BDN()) == null)) {
                        int intValue2 = BDN.intValue();
                        if (r4.Afm() != null && (AcG = r4.AcG()) != null && Aqv2.equals(Aqv) && intValue2 == 0 && AcG.contains(A00(i))) {
                            return r4.D0F().A00;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean A04(C84444t9 r3) {
        List AcG;
        C04220Ms.A0B(r3, 0);
        DayOfTheWeek A00 = A00(Calendar.getInstance().get(7));
        if (A00 == null || (AcG = r3.AcG()) == null || !AcG.contains(A00)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession, AnonymousClass24O r9) {
        int ordinal;
        C04220Ms.A0B(userSession, 1);
        if (r9 == null) {
            ordinal = -1;
        } else {
            ordinal = r9.ordinal();
        }
        boolean z = false;
        if (ordinal == 0) {
            long A04 = C63043bN.A01.A04(userSession);
            boolean A02 = C63043bN.A02(userSession);
            long A00 = C63433hT.A00();
            if (A04 <= 0 || !A02) {
                return false;
            }
            z = true;
            if (A00 < A04) {
                return false;
            }
        } else if (ordinal == 4 || ordinal == 3) {
            if (A01(userSession) != null) {
                return true;
            }
        } else if (ordinal != 1) {
            return z;
        } else {
            return true;
        }
        return z;
    }

    public static final DayOfTheWeek A00(int i) {
        switch (i) {
            case 1:
                return DayOfTheWeek.SUNDAY;
            case 2:
                return DayOfTheWeek.MONDAY;
            case 3:
                return DayOfTheWeek.TUESDAY;
            case 4:
                return DayOfTheWeek.WEDNESDAY;
            case 5:
                return DayOfTheWeek.THURSDAY;
            case 6:
                return DayOfTheWeek.FRIDAY;
            case 7:
                return DayOfTheWeek.SATURDAY;
            default:
                return null;
        }
    }
}
