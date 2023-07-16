package X;

import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.LongBuffer;
import java.util.HashMap;
import java.util.List;
import org.pytorch.Tensor;

/* renamed from: X.6Gn  reason: invalid class name and case insensitive filesystem */
public final class C98686Gn {
    public static final AnonymousClass79Q A00(List list, List list2) {
        long j;
        Type type;
        Object valueOf;
        C04220Ms.A0B(list, 0);
        if (list.isEmpty()) {
            throw new AnonymousClass5F7("examples list is empty");
        } else if (!list2.isEmpty()) {
            int size = list.size();
            int size2 = list2.size();
            int i = size * size2;
            float[] fArr = new float[i];
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < size; i2++) {
                HashMap hashMap = ((Example) list.get(i2)).A02;
                if (!hashMap.isEmpty()) {
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj = list2.get(i3);
                        int i4 = (i2 * size2) + i3;
                        if (hashMap.containsKey(obj)) {
                            FeatureData featureData = (FeatureData) hashMap.get(obj);
                            Type type2 = null;
                            if (!(featureData == null || (type = featureData.A02) == null)) {
                                int ordinal = type.ordinal();
                                if (ordinal == 1) {
                                    valueOf = Double.valueOf(featureData.A00);
                                } else if (ordinal == 0) {
                                    valueOf = Long.valueOf(featureData.A01);
                                }
                                fArr[i4] = C18240wQ.A00(valueOf);
                                j = 1;
                            }
                            StringBuilder A0s = C18190wL.A0s("transformDenseNumericalFeaturesToTensors only accepts features of long/double type. Got '");
                            if (featureData != null) {
                                type2 = featureData.A02;
                            }
                            A0s.append(type2);
                            throw new AnonymousClass5F7(C18180wK.A0i("' instead.", A0s));
                        }
                        fArr[i4] = 0.0f;
                        j = 0;
                        jArr[i4] = j;
                    }
                    continue;
                }
            }
            long j2 = (long) size;
            long j3 = (long) size2;
            Tensor fromBlob = Tensor.fromBlob(fArr, new long[]{j2, j3});
            long[] jArr2 = {j2, j3};
            C40282Lbk lbk = C40282Lbk.CONTIGUOUS;
            Tensor.checkShape(jArr2);
            Tensor.checkShapeAndDataCapacityConsistency(i, jArr2);
            Tensor.checkShape(jArr2);
            int i5 = 1;
            int i6 = 0;
            do {
                i5 = (int) (((long) i5) * jArr2[i6]);
                i6++;
            } while (i6 < 2);
            LongBuffer asLongBuffer = ByteBuffer.allocateDirect(((int) ((long) i5)) << 3).order(ByteOrder.nativeOrder()).asLongBuffer();
            asLongBuffer.put(jArr);
            return new AnonymousClass79Q(fromBlob, new MXS(asLongBuffer, lbk, jArr2));
        } else {
            throw new AnonymousClass5F7("feature id list is empty");
        }
    }
}
