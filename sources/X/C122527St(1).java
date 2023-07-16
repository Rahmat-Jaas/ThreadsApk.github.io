package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxIncentiveItem;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.IncentiveList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7St  reason: invalid class name and case insensitive filesystem */
public final class C122527St implements C142618fJ {
    public static final C122527St A00 = new C122527St();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List<ECPIncentive> list = ((IncentiveList) obj).A00;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (ECPIncentive BH2 : list) {
            A0w.add(BH2.BH2());
        }
        return new PuxIncentiveItem(AnonymousClass69U.A0Y, A0w);
    }
}
