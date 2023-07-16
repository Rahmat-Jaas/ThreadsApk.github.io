package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.msc.appdialog.viewmodel.AppDialogViewModel;
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
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6uw  reason: invalid class name and case insensitive filesystem */
public final class C115366uw {
    public final QuickPerformanceLogger A00;
    public final C143688h9 A01;
    public final C04560Oe A02;
    public final C04560Oe A03;
    public final C04560Oe A04;
    public final C04560Oe A05;
    public final C04560Oe A06;
    public final C04560Oe A07;

    public final Fragment A00(Bundle bundle, String str) {
        C04220Ms.A0B(str, 0);
        Fragment A012 = ((C113376rI) this.A02.get()).A01(bundle, str);
        if (A012 != null) {
            return A012;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C62793ak A01(AnonymousClass06C r3, int i) {
        Class cls;
        AnonymousClass7IU r1 = new AnonymousClass7IU(r3);
        this.A07.get();
        switch (i) {
            case 0:
                cls = SettingsViewModel.class;
                break;
            case 1:
                cls = PayoutsViewModel.class;
                break;
            case 2:
                cls = EarningsViewModel.class;
                break;
            case 4:
                cls = PayoutDetailsViewModel.class;
                break;
            case 5:
                cls = OverviewViewModel.class;
                break;
            case 6:
                cls = FeSelectorViewModel.class;
                break;
            case 7:
                cls = EarningsDetailViewModel.class;
                break;
            case 8:
                cls = TransactionsViewModel.class;
                break;
            case 9:
                cls = FilterViewModel.class;
                break;
            case 10:
                cls = EarningsDetailViewModelV2.class;
                break;
            case 11:
                cls = PayoutDetailsViewModelV2.class;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                cls = InfoTipViewModel.class;
                break;
            case 13:
                cls = AppDialogViewModel.class;
                break;
            default:
                throw C18190wL.A0a(AnonymousClass00U.A0J("MSCViewModelClassFactory does not support ViewModelId number ", i));
        }
        return r1.A01(cls);
    }

    public final AnonymousClass8e6 A02(Class cls) {
        AnonymousClass8e6 r0;
        C111086ml r2 = (C111086ml) this.A06.get();
        if (cls.equals(C128297jL.class)) {
            r0 = (C128297jL) r2.A02.getValue();
        } else if (cls.equals(C128267jI.class)) {
            r0 = (C128267jI) r2.A01.getValue();
        } else if (cls.equals(C128257jH.class)) {
            r0 = (C128257jH) r2.A00.getValue();
        } else if (cls.equals(C128317jN.class)) {
            r0 = (C128317jN) r2.A06.getValue();
        } else if (cls.equals(C128327jO.class)) {
            r0 = (C128327jO) r2.A07.getValue();
        } else if (cls.equals(C128287jK.class)) {
            r0 = (C128287jK) r2.A04.getValue();
        } else if (cls.equals(C128337jP.class)) {
            r0 = (C128337jP) r2.A08.getValue();
        } else if (cls.equals(C128307jM.class)) {
            r0 = (C128307jM) r2.A05.getValue();
        } else if (cls.equals(C128277jJ.class)) {
            r0 = (C128277jJ) r2.A03.getValue();
        } else {
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Input repository not implemented ", cls));
        }
        C04220Ms.A0C(r0, "null cannot be cast to non-null type T of com.facebookpay.msc.factoryimpl.BSCRepositoryFactory.getRepository");
        return r0;
    }

    public C115366uw(QuickPerformanceLogger quickPerformanceLogger, C143688h9 r2, C04560Oe r3, C04560Oe r4, C04560Oe r5, C04560Oe r6, C04560Oe r7, C04560Oe r8) {
        this.A01 = r2;
        this.A00 = quickPerformanceLogger;
        this.A02 = r3;
        this.A07 = r4;
        this.A05 = r5;
        this.A03 = r6;
        this.A06 = r7;
        this.A04 = r8;
    }
}
