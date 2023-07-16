package X;

import com.facebook.messenger.msystrace.metadataprovider.MsysQPLMetadataProvider;
import com.facebook.messenger.msystrace.metadataprovider.MsysQPLMetadataSnapshot;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.0Ev  reason: invalid class name */
public final class AnonymousClass0Ev extends C11940l3 {
    public static final ListenableFuture A00(MsysQPLMetadataSnapshot msysQPLMetadataSnapshot, MsysQPLMetadataSnapshot msysQPLMetadataSnapshot2, C09350fH r7) {
        C04220Ms.A0B(r7, 0);
        if (!(msysQPLMetadataSnapshot == null || msysQPLMetadataSnapshot2 == null)) {
            Map generateAnnotationMap = MsysQPLMetadataProvider.generateAnnotationMap(msysQPLMetadataSnapshot, msysQPLMetadataSnapshot2);
            C04220Ms.A06(generateAnnotationMap);
            for (Map.Entry entry : generateAnnotationMap.entrySet()) {
                Object value = entry.getValue();
                r7.AvU().A03((String) entry.getKey(), value);
            }
        }
        return C30954Gc6.A01((Object) null);
    }

    /* renamed from: A03 */
    public final MsysQPLMetadataSnapshot CuR(int i, int i2) {
        MsysQPLMetadataSnapshot snapshot = MsysQPLMetadataProvider.snapshot(false, i, i2);
        C04220Ms.A06(snapshot);
        return snapshot;
    }

    public final String B51() {
        return "msys_info";
    }

    public final int B52() {
        return 40;
    }

    public final Class BDT() {
        return MsysQPLMetadataSnapshot.class;
    }

    public final boolean BTR(C08640dy r3) {
        C04220Ms.A0B(r3, 0);
        return C07960cV.A05(AnonymousClass0e5.A00(36318441023476161L));
    }

    public final /* bridge */ /* synthetic */ ListenableFuture AHJ(C09350fH r2, Object obj, Object obj2) {
        return A00((MsysQPLMetadataSnapshot) obj, (MsysQPLMetadataSnapshot) obj2, r2);
    }

    public final Class BCf() {
        return BDT();
    }
}
