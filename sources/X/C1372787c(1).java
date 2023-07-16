package X;

import java.util.Map;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.87c  reason: invalid class name and case insensitive filesystem */
public abstract class C1372787c implements AnonymousClass8sP {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r1 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        r6.AKG(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        throw X.C18190wL.A0a(X.C04220Ms.A01("Polymorphic value has not been read for class ", r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r9) {
        /*
            r8 = this;
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r7 = r8.getDescriptor()
            X.8nQ r6 = r9.AAF(r7)
            r2 = 0
            r5 = 0
            r1 = 0
        L_0x000f:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r8.getDescriptor()     // Catch:{ all -> 0x0076 }
            int r4 = r6.AGx(r0)     // Catch:{ all -> 0x0076 }
            r0 = -1
            if (r4 == r0) goto L_0x0065
            if (r4 == 0) goto L_0x0031
            r3 = 1
            if (r4 == r3) goto L_0x0020
            goto L_0x003a
        L_0x0020:
            if (r2 == 0) goto L_0x005e
            X.Kyh r1 = r8.A00(r2, r6)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x004c
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r8.getDescriptor()     // Catch:{ all -> 0x0076 }
            java.lang.Object r1 = r6.AHC(r5, r1, r0, r3)     // Catch:{ all -> 0x0076 }
            goto L_0x000f
        L_0x0031:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r8.getDescriptor()     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = r6.AHH(r0, r4)     // Catch:{ all -> 0x0076 }
            goto L_0x000f
        L_0x003a:
            java.lang.String r1 = "Invalid index in polymorphic deserialization of "
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "unknown class"
        L_0x0040:
            java.lang.String r0 = "\n Expected 0, 1 or DECODE_DONE(-1), but found "
            java.lang.String r1 = X.AnonymousClass00U.A05(r4, r1, r2, r0)     // Catch:{ all -> 0x0076 }
            X.6Cb r0 = new X.6Cb     // Catch:{ all -> 0x0076 }
            r0.<init>(r1)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x004c:
            r1 = r8
            boolean r0 = r8 instanceof X.C141548bo     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0059
            X.8bo r1 = (X.C141548bo) r1     // Catch:{ all -> 0x0076 }
            X.0W7 r0 = r1.A04     // Catch:{ all -> 0x0076 }
        L_0x0055:
            X.AnonymousClass6W8.A00(r2, r0)     // Catch:{ all -> 0x0076 }
            throw r5     // Catch:{ all -> 0x0076 }
        L_0x0059:
            kotlinx.serialization.PolymorphicSerializer r1 = (kotlinx.serialization.PolymorphicSerializer) r1     // Catch:{ all -> 0x0076 }
            X.0W7 r0 = r1.A01     // Catch:{ all -> 0x0076 }
            goto L_0x0055
        L_0x005e:
            java.lang.String r0 = "Cannot read polymorphic value before its type token"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0065:
            if (r1 == 0) goto L_0x006b
            r6.AKG(r7)
            return r1
        L_0x006b:
            java.lang.String r0 = "Polymorphic value has not been read for class "
            java.lang.String r0 = X.C04220Ms.A01(r0, r2)     // Catch:{ all -> 0x0076 }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1372787c.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    public final void serialize(Encoder encoder, Object obj) {
        boolean A1Z = AnonymousClass0wJ.A1Z(encoder, obj);
        C145658kr A00 = AnonymousClass6W7.A00(obj, encoder, this);
        SerialDescriptor descriptor = getDescriptor();
        C146588mU AAG = encoder.AAG(descriptor);
        AAG.AK3(A00.getDescriptor().BAP(), getDescriptor(), 0);
        AAG.AJz(obj, A00, getDescriptor(), A1Z ? 1 : 0);
        AAG.AKG(descriptor);
    }

    public C145658kr A01(Object obj, Encoder encoder) {
        AnonymousClass0W7 r1;
        Map map;
        C145658kr r0;
        AnonymousClass76V r3 = ((C39082KmL) encoder).A05;
        if (this instanceof C141548bo) {
            r1 = ((C141548bo) this).A04;
        } else {
            r1 = ((PolymorphicSerializer) this).A01;
        }
        if (!AnonymousClass724.A01(r1).isInstance(obj) || (map = (Map) r3.A03.get(r1)) == null || (r0 = (C145658kr) map.get(C86124wJ.A16(obj))) == null) {
            return null;
        }
        return r0;
    }

    public C39721Kyh A00(String str, C147118nQ r6) {
        AnonymousClass0W7 r2;
        AnonymousClass0YY r22;
        C39721Kyh kyh;
        AnonymousClass76V BAR = r6.BAR();
        if (this instanceof C141548bo) {
            r2 = ((C141548bo) this).A04;
        } else {
            r2 = ((PolymorphicSerializer) this).A01;
        }
        Map map = (Map) BAR.A02.get(r2);
        if (map != null && (kyh = (C39721Kyh) map.get(str)) != null) {
            return kyh;
        }
        Object obj = BAR.A01.get(r2);
        if (!C03940Lk.A05(1, obj) || (r22 = (AnonymousClass0YY) obj) == null) {
            return null;
        }
        return (C39721Kyh) r22.invoke(str);
    }
}
