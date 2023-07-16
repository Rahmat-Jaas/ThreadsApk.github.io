package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* renamed from: X.7YS  reason: invalid class name */
public final class AnonymousClass7YS implements C143038g0 {
    public final ClipboardManager A00;

    public final void CqS(C134747yH r26) {
        CharSequence charSequence;
        ClipboardManager clipboardManager = this.A00;
        C134747yH r1 = r26;
        List list = r1.A03;
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        if (list.isEmpty()) {
            charSequence = r1.A00;
        } else {
            SpannableString spannableString = new SpannableString(r1.A00);
            Parcel obtain = Parcel.obtain();
            C04220Ms.A06(obtain);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass7HE A0H = C86154wM.A0H(list, i);
                AnonymousClass7F0 r7 = (AnonymousClass7F0) A0H.A02;
                int i2 = A0H.A01;
                int i3 = A0H.A00;
                obtain.recycle();
                obtain = Parcel.obtain();
                C04220Ms.A06(obtain);
                C04220Ms.A0B(r7, 0);
                long AYH = r7.A0D.AYH();
                long j = AnonymousClass7KE.A06;
                if (AYH != j) {
                    obtain.writeByte((byte) 1);
                    obtain.writeLong(r7.A0D.AYH());
                }
                long j2 = r7.A01;
                long j3 = AnonymousClass7HC.A01;
                if (j2 != j3) {
                    obtain.writeByte((byte) 2);
                    long j4 = r7.A01;
                    long A002 = AnonymousClass7HC.A00(j4);
                    byte b = 0;
                    if (!C18180wK.A1W((A002 > 0 ? 1 : (A002 == 0 ? 0 : -1)))) {
                        if (A002 == 4294967296L) {
                            b = 1;
                        } else if (A002 == 8589934592L) {
                            b = 2;
                        }
                    }
                    obtain.writeByte(b);
                    if (AnonymousClass7HC.A00(j4) != 0) {
                        obtain.writeFloat(Float.intBitsToFloat(C86104wH.A08(j4)));
                    }
                }
                C134817yQ r12 = r7.A09;
                if (r12 != null) {
                    obtain.writeByte((byte) 3);
                    obtain.writeInt(r12.A00);
                }
                C114236su r0 = r7.A07;
                if (r0 != null) {
                    int i4 = r0.A00;
                    obtain.writeByte((byte) 4);
                    byte b2 = 0;
                    if (!AnonymousClass0wJ.A1T(i4, 0) && i4 == 1) {
                        b2 = 1;
                    }
                    obtain.writeByte(b2);
                }
                C114246sv r02 = r7.A08;
                if (r02 != null) {
                    int i5 = r02.A00;
                    obtain.writeByte((byte) 5);
                    byte b3 = 0;
                    if (!AnonymousClass0wJ.A1T(i5, 0)) {
                        if (i5 == 1) {
                            b3 = 1;
                        } else if (i5 == 2) {
                            b3 = 2;
                        } else if (i5 == 3) {
                            b3 = 3;
                        }
                    }
                    obtain.writeByte(b3);
                }
                String str = r7.A0F;
                if (str != null) {
                    obtain.writeByte((byte) 6);
                    obtain.writeString(str);
                }
                if (r7.A02 != j3) {
                    obtain.writeByte((byte) 7);
                    long j5 = r7.A02;
                    long A003 = AnonymousClass7HC.A00(j5);
                    byte b4 = 0;
                    if (!C18180wK.A1W((A003 > 0 ? 1 : (A003 == 0 ? 0 : -1)))) {
                        if (A003 == 4294967296L) {
                            b4 = 1;
                        } else if (A003 == 8589934592L) {
                            b4 = 2;
                        }
                    }
                    obtain.writeByte(b4);
                    if (AnonymousClass7HC.A00(j5) != 0) {
                        obtain.writeFloat(Float.intBitsToFloat(C86104wH.A08(j5)));
                    }
                }
                C114266sx r03 = r7.A0B;
                if (r03 != null) {
                    float f = r03.A00;
                    obtain.writeByte((byte) 8);
                    obtain.writeFloat(f);
                }
                C121147Ei r13 = r7.A0E;
                if (r13 != null) {
                    obtain.writeByte((byte) 9);
                    obtain.writeFloat(r13.A00);
                    obtain.writeFloat(r13.A01);
                }
                if (r7.A00 != j) {
                    obtain.writeByte((byte) 10);
                    obtain.writeLong(r7.A00);
                }
                AnonymousClass79I r14 = r7.A0C;
                if (r14 != null) {
                    obtain.writeByte((byte) 11);
                    obtain.writeInt(r14.A00);
                }
                C1201679b r72 = r7.A03;
                if (r72 != null) {
                    obtain.writeByte((byte) 12);
                    obtain.writeLong(r72.A01);
                    long j6 = r72.A02;
                    obtain.writeFloat(AnonymousClass7KC.A01(j6));
                    obtain.writeFloat(AnonymousClass7KC.A02(j6));
                    obtain.writeFloat(r72.A00);
                }
                String encodeToString = Base64.encodeToString(obtain.marshall(), 0);
                C04220Ms.A06(encodeToString);
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeToString), i2, i3, 33);
            }
            charSequence = spannableString;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }

    public AnonymousClass7YS(Context context) {
        Object systemService = context.getSystemService("clipboard");
        C04220Ms.A0C(systemService, C18170wI.A00(43));
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        C04220Ms.A0B(clipboardManager, 1);
        this.A00 = clipboardManager;
    }
}
