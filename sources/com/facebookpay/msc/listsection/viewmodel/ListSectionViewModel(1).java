package com.facebookpay.msc.listsection.viewmodel;

import X.AnonymousClass065;
import X.C04220Ms;
import X.C62793ak;
import X.C880756q;
import X.C880856r;
import android.os.Bundle;
import com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel;
import com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModelV2;
import com.facebookpay.msc.earnings.viewmodel.EarningsViewModel;
import com.facebookpay.msc.feselector.viewmodel.FeSelectorViewModel;
import com.facebookpay.msc.filter.viewmodel.FilterViewModel;
import com.facebookpay.msc.infotip.viewmodel.InfoTipViewModel;
import com.facebookpay.msc.overview.viewmodel.OverviewViewModel;
import com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModel;
import com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2;
import com.facebookpay.msc.payouts.viewmodel.PayoutsViewModel;
import com.facebookpay.msc.settings.viewmodel.SettingsViewModel;
import com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel;

public abstract class ListSectionViewModel extends C62793ak implements AnonymousClass065 {
    public Boolean A00;
    public boolean A01;
    public Bundle A02;
    public final C880756q A03 = C880756q.A01();
    public final C880856r A04 = C880856r.A03();
    public final C880856r A05 = C880856r.A03();
    public final C880856r A06 = C880856r.A03();
    public final C880856r A07 = C880856r.A03();
    public final C880856r A08 = C880856r.A03();

    public final String A06() {
        if ((this instanceof PayoutDetailsViewModelV2) || (this instanceof PayoutDetailsViewModel)) {
            return "payout_details";
        }
        if (this instanceof InfoTipViewModel) {
            return "";
        }
        if (this instanceof FilterViewModel) {
            return "transactions";
        }
        if (this instanceof FeSelectorViewModel) {
            String str = ((FeSelectorViewModel) this).A03;
            if (str != null) {
                return str;
            }
            C04220Ms.A0E("_viewName");
            throw null;
        } else if (this instanceof TransactionsViewModel) {
            return "transactions";
        } else {
            if (this instanceof SettingsViewModel) {
                return "settings";
            }
            if (this instanceof PayoutsViewModel) {
                return "payouthub_payouts";
            }
            if (this instanceof OverviewViewModel) {
                return "overview";
            }
            if (this instanceof EarningsViewModel) {
                return "payouthub_earnings";
            }
            if ((this instanceof EarningsDetailViewModelV2) || (this instanceof EarningsDetailViewModel)) {
                return "earning_details";
            }
            return "app_level_dialogue_update";
        }
    }

    public void A07(Bundle bundle) {
        this.A02 = bundle;
        this.A01 = true;
    }
}
