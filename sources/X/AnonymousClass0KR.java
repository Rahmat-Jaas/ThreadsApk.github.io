package X;

import java.io.Writer;
import java.util.ArrayList;

/* renamed from: X.0KR  reason: invalid class name */
public final class AnonymousClass0KR {
    public static AnonymousClass0KR A00;

    public static synchronized AnonymousClass0KR A00() {
        AnonymousClass0KR r0;
        synchronized (AnonymousClass0KR.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new AnonymousClass0KR();
                A00 = r0;
            }
        }
        return r0;
    }

    private void A01(C03590Jr r6, Writer writer) {
        ArrayList arrayList = r6.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                writer.write(44);
            }
            A03(writer, arrayList.get(i), (String) null);
        }
    }

    private void A02(AnonymousClass0KD r8, Writer writer) {
        int i = r8.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                writer.write(44);
            }
            String A0C = r8.A0C(i2);
            writer.write(34);
            int length = A0C.length();
            for (int i3 = 0; i3 < length; i3++) {
                AnonymousClass0LE.A00(writer, A0C.charAt(i3));
            }
            writer.write(34);
            writer.write(58);
            A03(writer, r8.A0B(i2), A0C);
        }
    }

    private void A03(Writer writer, Object obj, String str) {
        String str2;
        String str3;
        int byteValue;
        if (obj == null) {
            str3 = "null";
        } else if (obj instanceof String) {
            String str4 = (String) obj;
            writer.write(34);
            int length = str4.length();
            for (int i = 0; i < length; i++) {
                AnonymousClass0LE.A00(writer, str4.charAt(i));
            }
            writer.write(34);
            return;
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            StringBuilder sb = ((AnonymousClass0LG) AnonymousClass0LG.A01.get()).A00;
            sb.delete(0, sb.length());
            if (number instanceof Float) {
                sb.append(number.floatValue());
            } else if (number instanceof Double) {
                sb.append(number.doubleValue());
            } else {
                if (number instanceof Integer) {
                    byteValue = number.intValue();
                } else if (number instanceof Long) {
                    sb.append(number.longValue());
                } else if (number instanceof Short) {
                    byteValue = number.shortValue();
                } else if (number instanceof Byte) {
                    byteValue = number.byteValue();
                } else {
                    StringBuilder sb2 = new StringBuilder("Type ");
                    sb2.append(number.getClass());
                    sb2.append(" not supported");
                    throw new UnsupportedOperationException(sb2.toString());
                }
                sb.append(byteValue);
            }
            int length2 = sb.length();
            for (int i2 = 0; i2 < length2; i2++) {
                writer.write(sb.charAt(i2));
            }
            return;
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                str3 = "true";
            } else {
                str3 = "false";
            }
        } else if (obj instanceof AnonymousClass0LH) {
            AnonymousClass0LH r6 = (AnonymousClass0LH) obj;
            Class<AnonymousClass0KR> cls = AnonymousClass0KR.class;
            AnonymousClass0KR r2 = this;
            AnonymousClass0KR r0 = r6.A02;
            if (r0 != null) {
                r2 = r0;
            }
            Class<?> cls2 = r2.getClass();
            if (cls2.equals(cls)) {
                AnonymousClass0KR r1 = this;
                AnonymousClass0SJ.A01(writer, "Writer is null!");
                AnonymousClass0KR r02 = r6.A02;
                if (r02 != null) {
                    r1 = r02;
                }
                r1.A04(r6, writer);
                return;
            }
            StringBuilder sb3 = new StringBuilder("Unsupported encoder=");
            sb3.append(cls2);
            sb3.append(", flags=");
            sb3.append(0);
            sb3.append(" combination");
            throw new IllegalStateException(sb3.toString());
        } else {
            if (str != null) {
                str2 = AnonymousClass00U.A0V(" (found in key '", str, "')");
            } else {
                str2 = "";
            }
            throw new IllegalArgumentException(AnonymousClass00U.A0d("The type ", obj.getClass().toString(), " is not supported", str2));
        }
        writer.write(str3);
    }

    public final void A04(AnonymousClass0LH r2, Writer writer) {
        int i;
        if (r2 instanceof AnonymousClass0KD) {
            writer.write(123);
            A02((AnonymousClass0KD) r2, writer);
            i = 125;
        } else {
            writer.write(91);
            A01((C03590Jr) r2, writer);
            i = 93;
        }
        writer.write(i);
    }

    public final void A05(AnonymousClass0LH r2, Writer writer) {
        if (r2 instanceof AnonymousClass0KD) {
            A02((AnonymousClass0KD) r2, writer);
        } else {
            A01((C03590Jr) r2, writer);
        }
    }
}
