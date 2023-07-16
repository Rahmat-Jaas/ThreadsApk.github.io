package X;

import android.content.Context;
import com.facebook.analytics2.logger.DefaultHandlerThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0AB  reason: invalid class name */
public final class AnonymousClass0AB {
    public static final AnonymousClass0CF A0G = new AnonymousClass0CF(0, 0, 0, 0);
    public static final AnonymousClass0CF A0H;
    public static final AnonymousClass0CF A0I = new AnonymousClass0CF(0, 0, 0, 0);
    public static final AnonymousClass0CF A0J;
    public AnonymousClass0B2 A00;
    public AnonymousClass0BQ A01;
    public final C05570Ug A02;
    public final C02340At A03;
    public final C04430Np A04;
    public final C02490Bq A05;
    public final AnonymousClass0U5 A06;
    public final AnonymousClass0U7 A07;
    public final AnonymousClass0U8 A08;
    public final C002601f A09;
    public final AnonymousClass0A9 A0A;
    public final AnonymousClass0AH A0B;
    public final AnonymousClass0Bf A0C;
    public final AnonymousClass0Hu A0D;
    public final AnonymousClass0LI A0E;
    public final Context A0F;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A0J = new AnonymousClass0CF(timeUnit.toMillis(15), timeUnit.toMillis(45), 0, timeUnit.toMillis(30));
        A0H = new AnonymousClass0CF(timeUnit.toMillis(15), timeUnit.toMillis(45), 0, timeUnit.toMillis(30));
    }

    public AnonymousClass0AB(Context context, C002601f r32, C05570Ug r33, AnonymousClass0AG r34, AnonymousClass0AH r35, C02160Ab r36, AnonymousClass0B2 r37, AnonymousClass0BP r38, AnonymousClass0BP r39, AnonymousClass0BQ r40, AnonymousClass0Bf r41, C02490Bq r42, AnonymousClass0CG r43, C02530Bu r44, C02530Bu r45, C02460Bl r46, AnonymousClass0U5 r47, AnonymousClass0U7 r48, AnonymousClass0U8 r49, Class cls, Class cls2, Class cls3) {
        Class cls4 = cls;
        AnonymousClass0CG r1 = r43;
        AnonymousClass0AG r11 = r34;
        C002601f r2 = r32;
        AnonymousClass0IO.A01 = this;
        AnonymousClass0IO r0 = AnonymousClass0IO.A02;
        if (r0 == null) {
            r0 = new AnonymousClass0IO();
            AnonymousClass0IO.A02 = r0;
        }
        this.A03 = r0;
        this.A09 = r32 == null ? new AnonymousClass0SA(6) : r2;
        AnonymousClass0AH r12 = r35;
        this.A0B = r12;
        this.A02 = r33;
        AnonymousClass0LI r02 = new AnonymousClass0LI();
        this.A0E = r02;
        this.A0C = r41;
        C02490Bq r22 = r42;
        this.A05 = r22;
        this.A01 = r40;
        this.A00 = r37;
        Context context2 = context;
        context2.getClass();
        this.A0F = context2;
        AnonymousClass0U5 r8 = r47;
        this.A06 = r8;
        AnonymousClass0U7 r7 = r48;
        this.A07 = r7;
        AnonymousClass0U8 r6 = r49;
        this.A08 = r6;
        C04930Px r15 = new C04930Px();
        if (r34 == null) {
            synchronized (AnonymousClass0FM.class) {
                if (AnonymousClass0FM.A03 == null) {
                    AnonymousClass0FM r5 = new AnonymousClass0FM();
                    AnonymousClass0FM.A03 = r5;
                    r22.A02.registerObserver(r5);
                }
                r11 = AnonymousClass0FM.A03;
            }
        }
        Class cls5 = cls3;
        cls5.getClass();
        cls4 = cls == null ? DefaultHandlerThreadFactory.class : cls4;
        C02180Ad r14 = new C02180Ad(r15, r02, r8, r7, r6);
        r1 = r43 == null ? new AnonymousClass0Eq(A0J, A0H) : r1;
        AnonymousClass0CG r18 = r1;
        AnonymousClass0Eq r19 = new AnonymousClass0Eq(A0I, A0G);
        AnonymousClass0BQ r17 = this.A01;
        C04430Np r9 = new C04430Np(context2, r11, r12, r36, r14, r39, r38, r17, r18, r19, r45, r44, r02, cls5, cls2, cls4, r46.BfE(), r46.BPH(), r46.DA9());
        this.A04 = r9;
        this.A0A = r9;
        this.A0D = new AnonymousClass0Hu(r9, r11, r22, r46.DA2());
        if (cls2 != null) {
            r22.A02.registerObserver(new AnonymousClass0I5(context2));
        }
    }
}
