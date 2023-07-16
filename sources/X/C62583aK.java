package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3aK  reason: invalid class name and case insensitive filesystem */
public final class C62583aK {
    public static final int[] A07;
    public long A00;
    public boolean A01;
    public final C81264nT A02;
    public final List A03;
    public final List A04;
    public final boolean A05;
    public final AnonymousClass375[] A06;

    static {
        int[] iArr = new int[19];
        A07 = iArr;
        iArr[0] = 8000;
        iArr[1] = 0;
        iArr[2] = 500;
        iArr[3] = 2000;
        iArr[4] = 500;
        iArr[5] = 2000;
        iArr[6] = 500;
        iArr[7] = 2000;
        iArr[8] = 8000;
        iArr[9] = 500;
        iArr[10] = 30000;
        iArr[11] = 30000;
        iArr[16] = 1;
        iArr[17] = 1;
        iArr[18] = 1;
    }

    public C62583aK(HeroPlayerSetting heroPlayerSetting, C81264nT r19) {
        AnonymousClass375 r0;
        AnonymousClass375 r02;
        AnonymousClass375 r03;
        AnonymousClass375 r04;
        AnonymousClass375[] r7 = new AnonymousClass375[19];
        this.A06 = r7;
        int i = 0;
        this.A01 = false;
        HeroPlayerSetting heroPlayerSetting2 = heroPlayerSetting;
        this.A05 = heroPlayerSetting2.A3C;
        C306722l r9 = C306722l.DEGRADED;
        Pair A0H = C18220wO.A0H(r9, 100000);
        C306722l r2 = C306722l.POOR;
        Pair A0H2 = C18220wO.A0H(r2, 1000);
        C306722l r1 = C306722l.MODERATE;
        Pair A0H3 = C18220wO.A0H(r1, 500);
        C306722l r11 = C306722l.GOOD;
        this.A03 = Collections.unmodifiableList(Arrays.asList(new Pair[]{A0H, A0H2, A0H3, C18220wO.A0H(r11, 250)}));
        C72374Nu r10 = heroPlayerSetting2.A0s;
        this.A04 = Collections.unmodifiableList(Arrays.asList(new Pair[]{C18220wO.A0H(r9, r10.A01), C18220wO.A0H(r2, r10.A05), C18220wO.A0H(r1, r10.A04), C18220wO.A0H(r11, r10.A03)}));
        C72374Nu r12 = heroPlayerSetting2.A0m;
        if (r12 != null) {
            r0 = new AnonymousClass375(r12);
        } else {
            r0 = null;
        }
        r7[0] = r0;
        AnonymousClass375 r13 = null;
        r7[1] = null;
        C72374Nu r05 = heroPlayerSetting2.A0o;
        r7[2] = r05 != null ? new AnonymousClass375(r05) : r13;
        C72374Nu r14 = heroPlayerSetting2.A0p;
        if (r14 != null) {
            r02 = new AnonymousClass375(r14);
        } else {
            r02 = null;
        }
        r7[3] = r02;
        AnonymousClass375 r22 = null;
        r7[4] = null;
        r7[5] = null;
        r7[12] = null;
        r7[13] = null;
        r7[14] = null;
        r7[15] = null;
        r7[6] = null;
        r7[7] = null;
        C72374Nu r06 = heroPlayerSetting2.A0l;
        r7[8] = r06 != null ? new AnonymousClass375(r06) : r22;
        AnonymousClass375 r23 = null;
        r7[9] = null;
        C72374Nu r07 = heroPlayerSetting2.A0t;
        r7[10] = r07 != null ? new AnonymousClass375(r07) : r23;
        C72374Nu r15 = heroPlayerSetting2.A0k;
        if (r15 != null) {
            r03 = new AnonymousClass375(r15);
        } else {
            r03 = null;
        }
        r7[11] = r03;
        AnonymousClass375 r24 = null;
        r7[16] = null;
        C72374Nu r08 = heroPlayerSetting2.A0r;
        r7[17] = r08 != null ? new AnonymousClass375(r08) : r24;
        C72374Nu r16 = heroPlayerSetting2.A0q;
        if (r16 != null) {
            r04 = new AnonymousClass375(r16);
        } else {
            r04 = null;
        }
        r7[18] = r04;
        while (true) {
            if (this.A06[i] == null) {
                i++;
                if (i >= 19) {
                    break;
                }
            } else {
                this.A01 = true;
                break;
            }
        }
        this.A02 = r19;
    }

    public static int A00(C62583aK r10, int i) {
        C306722l r0;
        int i2;
        long j;
        AnonymousClass375[] r7 = r10.A06;
        if (r7[i] == null) {
            return A07[i];
        }
        if (r10.A01 && r10.A02 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - r10.A00 > 2000) {
                long j2 = -1;
                if (r10.A05) {
                    C37182Jm3 A002 = C37182Jm3.A00();
                    synchronized (A002) {
                        j = A002.A02;
                    }
                    if (j >= 0) {
                        j2 = j;
                    }
                }
                List list = r10.A04;
                if (j2 >= 0) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r0 = C306722l.EXCELLENT;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        if (j2 < ((long) AnonymousClass0wJ.A04(pair.second))) {
                            r0 = (C306722l) pair.first;
                            break;
                        }
                    }
                } else {
                    r0 = C306722l.UNKNOWN;
                }
                int i3 = 0;
                do {
                    if (r7[i3] != null) {
                        AnonymousClass375 r8 = r7[i3];
                        if (r0 != null) {
                            C72374Nu r5 = r8.A01;
                            if (r5.A06) {
                                int ordinal = r0.ordinal();
                                if (ordinal == 4) {
                                    i2 = r5.A02;
                                } else if (ordinal == 3) {
                                    i2 = r5.A03;
                                } else if (ordinal == 2) {
                                    i2 = r5.A04;
                                } else if (ordinal == 1) {
                                    i2 = r5.A05;
                                } else if (ordinal != 0) {
                                    i2 = r5.A00;
                                } else {
                                    i2 = r5.A01;
                                }
                                r8.A00 = i2;
                            }
                        }
                    }
                    i3++;
                } while (i3 < 19);
                r10.A00 = elapsedRealtime;
            }
        }
        return r7[i].A00;
    }

    public C62583aK() {
        this(HeroPlayerSetting.A3Z, (C81264nT) null);
    }
}
