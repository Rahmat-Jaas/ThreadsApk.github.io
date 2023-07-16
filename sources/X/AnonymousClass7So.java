package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxIncentiveItem;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.IncentiveList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7So  reason: invalid class name */
public final class AnonymousClass7So implements C142618fJ {
    public static final AnonymousClass7So A00 = new AnonymousClass7So();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        List<ECPIncentive> list = ((IncentiveList) obj).A00;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (ECPIncentive BH2 : list) {
            A0w.add(BH2.BH2());
        }
        return new PuxIncentiveItem(AnonymousClass69U.A0Y, A0w);
    }
}
