package X;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.mindeputils.IVerboseDebuggable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.07v  reason: invalid class name and case insensitive filesystem */
public abstract class C016507v implements AnonymousClass0FA, IVerboseDebuggable {
    public static final AnonymousClass0K9 A0J = new AnonymousClass0K9("FoundActivityLifecycleInfo");
    public Activity A00;
    public Intent A01;
    public ActivityInfo A02;
    public IBinder A03;
    public Parcelable A04;
    public C019509b A05;
    public Object A06;
    public Object A07;
    public WeakReference A08 = null;
    public WeakReference A09 = null;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public final AnonymousClass012 A0D;
    public final C03190Eu A0E;
    public final AnonymousClass0F0 A0F;
    public final C03410If A0G;
    public final String A0H;
    public final boolean A0I;

    public abstract StringBuilder A04(StringBuilder sb, boolean z);

    public abstract boolean A05(Message message);

    public abstract boolean A06(Message message, C019509b r2);

    public abstract boolean A07(Parcel parcel);

    public abstract boolean A08(Parcelable parcelable, Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = r2.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(android.os.Parcelable r5) {
        /*
            r4 = this;
            X.0F0 r2 = r4.A0F
            r2.getClass()
            r0 = 0
            java.lang.reflect.Method r1 = r2.A06     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0049
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0039 }
            java.lang.Object r1 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x0039 }
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0049
            X.0Eu r0 = r2.A09     // Catch:{ Exception -> 0x0039 }
            java.lang.Object r3 = r0.A01(r1)     // Catch:{ Exception -> 0x0039 }
            if (r3 == 0) goto L_0x0049
            boolean r0 = r0.A02(r1, r4, r3)     // Catch:{ Exception -> 0x0039 }
            if (r0 != 0) goto L_0x0032
            X.0K9 r2 = X.AnonymousClass0F0.A0D     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = "We were unable to parse activity info for %s from activity client record %s."
            X.012 r0 = r4.A0D     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = r0.A03     // Catch:{ Exception -> 0x0039 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}     // Catch:{ Exception -> 0x0039 }
            r2.A07(r1, r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0049
        L_0x0032:
            java.lang.Object r0 = r4.A07
            boolean r0 = r4.A08(r5, r0)
            return r0
        L_0x0039:
            r3 = move-exception
            X.0K9 r2 = X.AnonymousClass0F0.A0D
            X.012 r0 = r4.A0D
            java.lang.String r0 = r0.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Could not get activity lifecycle state for %s from the client transaction"
            r2.A0B(r3, r0, r1)
        L_0x0049:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016507v.A00(android.os.Parcelable):boolean");
    }

    public final boolean A03() {
        boolean z;
        IBinder iBinder;
        Field[] A002;
        Class cls;
        Parcelable parcelable;
        if (this.A0A) {
            return this.A0C;
        }
        if (!this.A0B) {
            return false;
        }
        try {
            WeakReference weakReference = this.A08;
            if (weakReference != null) {
                Message message = (Message) weakReference.get();
                if (message != null) {
                    z = false;
                    if (this.A0I) {
                        AnonymousClass0F0 r1 = this.A0F;
                        r1.getClass();
                        if (this.A04 == null) {
                            Object obj = message.obj;
                            if (!(obj == null || (cls = r1.A03) == null || !cls.isAssignableFrom(obj.getClass()) || (parcelable = (Parcelable) obj) == null)) {
                                this.A04 = parcelable;
                            }
                        }
                    }
                    Parcelable parcelable2 = this.A04;
                    if (parcelable2 != null) {
                        z = A00(parcelable2);
                    } else {
                        C03190Eu r6 = this.A0E;
                        Object obj2 = message.obj;
                        if (obj2 != null) {
                            if (obj2 instanceof IBinder) {
                                IBinder iBinder2 = (IBinder) obj2;
                                if (!r6.A02(iBinder2, this, r6.A01(iBinder2))) {
                                }
                            } else {
                                C03410If r11 = r6.A0E;
                                Class<?> cls2 = obj2.getClass();
                                C019509b A003 = AnonymousClass0F7.A00(obj2);
                                if (A003 == null) {
                                    boolean z2 = AnonymousClass0QR.A02;
                                    boolean z3 = !z2;
                                    if (!z2 && !AnonymousClass0QR.A03) {
                                        Class forName = r11.forName("com.android.internal.os.SomeArgs");
                                        Field[] A004 = AnonymousClass0QR.A00(r11, forName, Object.class, "arg", 9);
                                        if (!(A004 == null || (A002 = AnonymousClass0QR.A00(r11, forName, Integer.TYPE, "argi", 6)) == null)) {
                                            Arrays.toString(A004);
                                            Arrays.toString(A002);
                                            AnonymousClass0QR.A01 = forName;
                                            AnonymousClass0QR.A05 = A004;
                                            AnonymousClass0QR.A04 = A002;
                                            z3 = true;
                                            AnonymousClass0QR.A02 = !z3;
                                            AnonymousClass0QR.A03 = true;
                                        }
                                        z3 = false;
                                        AnonymousClass0QR.A02 = !z3;
                                        AnonymousClass0QR.A03 = true;
                                    }
                                    if (z3 && !(obj2 instanceof IBinder)) {
                                        Class cls3 = AnonymousClass0QR.A01;
                                        cls3.getClass();
                                        if (cls3.isAssignableFrom(cls2)) {
                                            A003 = new AnonymousClass0QR(obj2);
                                        }
                                    }
                                }
                                try {
                                    Object A032 = A003.A03(1);
                                    if (A032 != null) {
                                        try {
                                            IBinder iBinder3 = (IBinder) A032;
                                            if (iBinder3 != null) {
                                                if (r6.A02(iBinder3, this, r6.A01(iBinder3))) {
                                                    this.A05 = A003;
                                                }
                                            }
                                        } catch (ClassCastException e) {
                                            AnonymousClass0F8.A00.A03("Could not convert arg 1 to IBinder", e);
                                        }
                                    }
                                } catch (AnonymousClass0KI e2) {
                                    AnonymousClass0F8.A00.A09(e2, "Could not get SomeArgs object arg at %d.", 1);
                                }
                            }
                            C019509b r0 = this.A05;
                            z = r0 != null ? A06(message, r0) : A05(message);
                        }
                    }
                }
                z = false;
            } else {
                WeakReference weakReference2 = this.A09;
                if (weakReference2 != null) {
                    Parcel parcel = (Parcel) weakReference2.get();
                    if (parcel != null) {
                        z = false;
                        if (this.A0I) {
                            AnonymousClass0F0 r12 = this.A0F;
                            r12.getClass();
                            if (this.A04 == null) {
                                Parcelable A012 = r12.A01(parcel);
                                if (A012 != null) {
                                    this.A04 = A012;
                                }
                            }
                        }
                        Parcelable parcelable3 = this.A04;
                        if (parcelable3 != null) {
                            z = A00(parcelable3);
                        } else {
                            C03190Eu r4 = this.A0E;
                            try {
                                parcel.enforceInterface("android.app.IApplicationThread");
                                iBinder = parcel.readStrongBinder();
                            } catch (Exception e3) {
                                C03190Eu.A0G.A0C(e3, "Failed to parse a token from the parcel data.", new Object[0]);
                                iBinder = null;
                            }
                            if (r4.A02(iBinder, this, r4.A01(iBinder))) {
                                z = A07(parcel);
                            }
                        }
                    }
                    z = false;
                } else {
                    z = true;
                }
            }
        } catch (Exception e4) {
            AnonymousClass0F8.A00.A03("Could not find SomeArgs class.", e4);
        } catch (Throwable th) {
            this.A08 = null;
            this.A09 = null;
            throw th;
        }
        this.A0C |= z;
        this.A0A = true;
        this.A08 = null;
        this.A09 = null;
        return z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Activity ");
        Activity activity = this.A00;
        if (this.A0A) {
            str = "<Not Parsed>";
        } else {
            str = "Unknown";
        }
        if (activity != null) {
            str = activity.getClass().getName();
        }
        sb.append(str);
        sb.append(" Lifecycle ");
        sb.append(this.A0H);
        sb.append(" for ");
        sb.append(this.A0D.A03);
        sb.append(' ');
        A04(sb, false);
        return sb.toString();
    }

    public C016507v(AnonymousClass012 r2, C03190Eu r3, AnonymousClass0F0 r4, C03410If r5, String str, boolean z) {
        this.A0H = str;
        this.A0G = r5;
        this.A0E = r3;
        r2.getClass();
        this.A0D = r2;
        this.A0F = r4;
        this.A0I = z;
    }

    public final void A02() {
        if (!A03()) {
            throw new AnonymousClass0F9();
        }
    }
}
