package X;

import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.82G  reason: invalid class name */
public final class AnonymousClass82G implements Runnable {
    public final /* synthetic */ C125877eD A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public AnonymousClass82G(C125877eD r1, List list, List list2) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = list2;
    }

    public final void run() {
        C125877eD r5 = this.A00;
        List list = this.A01;
        List list2 = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Example) list.get(i)).A02.put("-1", new FeatureData(Type.DOUBLE, "-1", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, C86124wJ.A00(list2.get(i)), 16372, 0, false));
        }
        r5.A01.CwH(list);
    }
}
