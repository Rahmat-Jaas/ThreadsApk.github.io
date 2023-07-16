package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape5S1200000_I2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8bo  reason: invalid class name and case insensitive filesystem */
public final class C141548bo extends C1372787c {
    public List A00 = AnonymousClass0ZV.A00;
    public final Map A01;
    public final Map A02;
    public final C04530Oa A03;
    public final AnonymousClass0W7 A04;

    public final C39721Kyh A00(String str, C147118nQ r3) {
        C39721Kyh kyh = (C39721Kyh) this.A02.get(str);
        if (kyh == null) {
            return super.A00(str, r3);
        }
        return kyh;
    }

    public final C145658kr A01(Object obj, Encoder encoder) {
        C145658kr r0 = (C145658kr) this.A01.get(C86124wJ.A16(obj));
        if (r0 != null) {
            return r0;
        }
        C145658kr A012 = super.A01(obj, encoder);
        if (A012 == null) {
            return null;
        }
        return A012;
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A03.getValue();
    }

    public C141548bo(String str, AnonymousClass0W7 r8, Annotation[] annotationArr, AnonymousClass0W7[] r10, AnonymousClass8sP[] r11) {
        this.A04 = r8;
        this.A03 = AnonymousClass0OY.A01(AnonymousClass006.A01, new KtLambdaShape5S1200000_I2(r11, this, str, 44));
        int length = r10.length;
        int length2 = r11.length;
        if (length == length2) {
            int min = Math.min(length, length2);
            ArrayList A0k = C18240wQ.A0k(min);
            for (int i = 0; i < min; i++) {
                A0k.add(C18180wK.A0p(r10[i], r11[i]));
            }
            Map A0B = AnonymousClass4WJ.A0B(A0k);
            this.A01 = A0B;
            Set<Map.Entry> entrySet = A0B.entrySet();
            LinkedHashMap A0y = C18220wO.A0y();
            for (Map.Entry entry : entrySet) {
                String BAP = ((AnonymousClass8sP) entry.getValue()).getDescriptor().BAP();
                Object obj = A0y.get(BAP);
                if (obj == null) {
                    A0y.containsKey(BAP);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    A0y.put(BAP, entry);
                } else {
                    StringBuilder A0s = C18190wL.A0s("Multiple sealed subclasses of '");
                    A0s.append(this.A04);
                    A0s.append("' have the same serial name '");
                    A0s.append(BAP);
                    A0s.append("': '");
                    A0s.append(entry2.getKey());
                    A0s.append("', '");
                    A0s.append(entry.getKey());
                    throw C18180wK.A0a(C86114wI.A0q(A0s, '\''));
                }
            }
            LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(A0y.size()));
            Iterator it = A0y.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                C86144wL.A1P(A0o.getKey(), A0v, (Map.Entry) A0o.getValue());
            }
            this.A02 = A0v;
            List asList = Arrays.asList(annotationArr);
            C04220Ms.A06(asList);
            this.A00 = asList;
            return;
        }
        StringBuilder A0s2 = C18190wL.A0s("All subclasses of sealed class ");
        A0s2.append(AnonymousClass0N8.A00(((C02230Ai) this.A04).A00));
        throw C18190wL.A0a(C18180wK.A0i(" should be marked @Serializable", A0s2));
    }
}
