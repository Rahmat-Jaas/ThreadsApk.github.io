package X;

import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.Comparator;

/* renamed from: X.83p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1366383p implements Comparator {
    public static final /* synthetic */ C1366383p A00 = new C1366383p();

    public final int compare(Object obj, Object obj2) {
        SlowMotionData.Segment segment = (SlowMotionData.Segment) obj;
        SlowMotionData.Segment segment2 = (SlowMotionData.Segment) obj2;
        return LzB.A00.A02(segment.A02, segment2.A02).A02(segment.A01, segment2.A01).A01(segment.A00, segment2.A00).A00();
    }
}
