package X;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Field;

/* renamed from: X.0QT  reason: invalid class name */
public final class AnonymousClass0QT extends C016507v implements AnonymousClass0FA {
    public static Class A04;
    public static Field A05;
    public static Field A06;
    public static Field A07;
    public static Field A08;
    public static boolean A09;
    public static boolean A0A;
    public static final AnonymousClass0K9 A0B = new AnonymousClass0K9("PauseActivityInfo");
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public final boolean A05(Message message) {
        return A01(message, (C019509b) null);
    }

    public final boolean A07(Parcel parcel) {
        if (!A00()) {
            return false;
        }
        try {
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            this.A02 = z;
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            this.A03 = z2;
            this.A00 = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            this.A01 = z3;
            return true;
        } catch (Exception e) {
            A0B.A04("Failed to parse on paise data because the form was different than expected", e);
            return false;
        }
    }

    public AnonymousClass0QT(C03190Eu r8, C03410If r9) {
        super(AnonymousClass012.A07, r8, (AnonymousClass0F0) null, r9, "Pause", false);
        this.A04 = null;
        this.A07 = null;
    }

    private boolean A00() {
        boolean z;
        C03410If r5 = this.A0G;
        if (A0A) {
            z = !A09;
        } else {
            try {
                C03400Id r3 = C03400Id.LikelyHidden;
                Class A0C = r5.A0C(r3, "android.app.servertransaction.PauseActivityItem");
                A04 = A0C;
                Class cls = Boolean.TYPE;
                A07 = r5.A0H(r3, A0C, cls, "mFinished");
                A08 = r5.A0H(r3, A0C, cls, "mUserLeaving");
                A05 = r5.A0H(r3, A0C, Integer.TYPE, "mConfigChanges");
                A06 = r5.A0H(r3, A0C, Boolean.TYPE, "mDontReport");
                z = true;
            } catch (Exception e) {
                A0B.A0B(e, "Could not get Pause Activity ClientTransaction code", new Object[0]);
                z = false;
            }
            A09 = !z;
            A0A = true;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final StringBuilder A04(StringBuilder sb, boolean z) {
        if (this.A0A) {
            sb.append(" finished: ");
            sb.append(this.A02);
            sb.append(" userLeaving: ");
            sb.append(this.A03);
            sb.append(" config: ");
            sb.append(this.A00);
            sb.append(" dontReport: ");
            sb.append(this.A01);
            return sb;
        }
        sb.append("Not yet parsed");
        return sb;
    }

    public final boolean A08(Parcelable parcelable, Object obj) {
        Class cls;
        AnonymousClass0K9 r2;
        Object[] objArr;
        String str;
        String str2 = this.A0D.A03;
        if (A00() && (cls = A04) != null) {
            if (obj == null) {
                r2 = C016507v.A0J;
                objArr = new Object[]{str2, cls};
                str = "Not activityLifecycleItem item found for %s so it is definitely not of type %s.";
            } else {
                Class<?> cls2 = obj.getClass();
                if (!cls.isAssignableFrom(cls2)) {
                    r2 = C016507v.A0J;
                    objArr = new Object[]{str2, cls2, cls};
                    str = "Cannot parse ClientTransaction %s because the ActivityLifecycleItem class is %s when it should be assignable from %s.";
                } else {
                    Field field = A07;
                    Field field2 = A08;
                    Field field3 = A05;
                    Field field4 = A06;
                    if (field == null || field2 == null || field3 == null || field4 == null) {
                        r2 = A0B;
                        objArr = new Object[0];
                        str = "Failed to parse on pause since we are missing some needed fields";
                    } else {
                        try {
                            this.A02 = field.getBoolean(obj);
                            this.A03 = field2.getBoolean(obj);
                            this.A00 = field3.getInt(obj);
                            this.A01 = field4.getBoolean(obj);
                            return true;
                        } catch (ClassCastException | IllegalAccessException e) {
                            A0B.A04("Failed to get on pause info from client transaction.", e);
                            return false;
                        }
                    }
                }
            }
            r2.A07(str, objArr);
        }
        return false;
    }

    private boolean A01(Message message, C019509b r9) {
        int i;
        boolean z = false;
        if (!A00()) {
            return false;
        }
        boolean z2 = false;
        if (message.what == 102) {
            z2 = true;
        }
        int i2 = message.arg1;
        if (r9 != null) {
            i2 = r9.A01(1, i2);
            i = r9.A01(2, message.arg2);
        } else {
            i = message.arg2;
        }
        this.A02 = z2;
        boolean z3 = false;
        if ((i2 & 1) != 0) {
            z3 = true;
        }
        this.A03 = z3;
        this.A00 = i;
        if ((i2 & 2) != 0) {
            z = true;
        }
        this.A01 = z;
        return true;
    }

    public final boolean A06(Message message, C019509b r3) {
        return A01(message, r3);
    }

    public AnonymousClass0QT(Parcelable parcelable, C03190Eu r9, AnonymousClass0F0 r10, C03410If r11, Object obj) {
        super(AnonymousClass012.A07, r9, r10, r11, "Pause", true);
        this.A04 = parcelable;
        this.A07 = obj;
    }
}
