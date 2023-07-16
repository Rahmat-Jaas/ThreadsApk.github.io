package com.facebookpay.msc.feselector.viewmodel;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0wJ;
import X.AnonymousClass5iA;
import X.AnonymousClass5iI;
import X.AnonymousClass5iR;
import X.AnonymousClass69Q;
import X.AnonymousClass7BK;
import X.AnonymousClass7E5;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C121177En;
import X.C121187Eo;
import X.C121697Hn;
import X.C121777Ib;
import X.C128097is;
import X.C128107it;
import X.C146928n6;
import X.C146998nD;
import X.C18180wK;
import X.C86134wK;
import X.C86144wL;
import X.C880756q;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.pando.TreeJNI;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.redex.IDxSProviderShape515S0100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import java.util.List;

public abstract class ListSectionWithFeSelectorViewModel extends ListSectionViewModel {
    public int A00 = -1;
    public LoggingData A01;
    public List A02;
    public final C880756q A03 = C880756q.A01();
    public final C121177En A04;

    public ListSectionWithFeSelectorViewModel(C121177En r4) {
        C04220Ms.A0B(r4, 1);
        this.A04 = r4;
        r4.A04.put("list_selection_fe_selector_financial_entity", new IDxSProviderShape515S0100000_2_I2(this, 3));
    }

    public boolean A0A(Bundle bundle, Integer num) {
        int i;
        Object obj = null;
        Parcelable parcelable = bundle.getParcelable("financial_entity");
        if (parcelable != null) {
            obj = C121697Hn.A01(parcelable);
        }
        TreeJNI treeJNI = (TreeJNI) obj;
        LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
        if (loggingData != null) {
            this.A01 = loggingData;
            if (treeJNI == null) {
                return false;
            }
            C880756q r3 = this.A03;
            if (C04220Ms.A0I(r3.A08(), treeJNI)) {
                return false;
            }
            String A0r = C86144wL.A0r(treeJNI);
            if (A0r != null) {
                int i2 = this.A00;
                if (i2 == 0) {
                    i = 667749724;
                } else if (i2 != 5) {
                    if (i2 == 8) {
                        i = 667758015;
                    }
                    r3.A0H(treeJNI);
                    return true;
                } else {
                    i = 667754853;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    AnonymousClass7Kz.A06();
                    AnonymousClass7BK.A00(intValue, 0, 615);
                    AnonymousClass7Kz.A06();
                    MarkerEditor A032 = AnonymousClass7Kz.A03("financial_entity", intValue, 0);
                    A032.annotate("financial_entity_id", A0r);
                    A032.markerEditingCompleted();
                }
                r3.A0H(treeJNI);
                return true;
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass5iR A08() {
        String str;
        AnonymousClass5iR A002 = AnonymousClass5iR.A00(13);
        AnonymousClass5iA r3 = new AnonymousClass5iA();
        TreeJNI A0N = C86144wL.A0N(this);
        if (A0N != null) {
            str = A0N.getStringValue("company_name");
        } else {
            str = null;
        }
        r3.A00 = new C121777Ib((C146998nD) null, C128107it.A01(str), AnonymousClass69Q.A0z);
        r3.A00 = C86134wK.A0P(this, 26);
        C121187Eo r5 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        r5.A04 = true;
        r5.A00 = C128097is.A00(new Object[0], 2131827312);
        r5.A02 = AnonymousClass006.A01;
        AnonymousClass7E5.A00(r5, r3);
        A002.A05 = new AnonymousClass5iI(r3);
        A002.A02 = 1;
        return A002;
    }

    public final LoggingData A09() {
        LoggingData loggingData = this.A01;
        if (loggingData != null) {
            return loggingData;
        }
        C04220Ms.A0E("loggingData");
        throw null;
    }

    public void A07(Bundle bundle) {
        Integer num;
        LoggingData loggingData;
        Object obj;
        super.A07(bundle);
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("viewmodel_class"));
        } else {
            num = null;
        }
        if (num != null) {
            this.A00 = num.intValue();
            if (bundle == null || (loggingData = (LoggingData) bundle.getParcelable("logging_data")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            this.A01 = loggingData;
            List A022 = C121697Hn.A02(bundle);
            if (A022 != null) {
                this.A02 = A022;
                Bundle bundle2 = (Bundle) this.A04.A00("list_selection_fe_selector_financial_entity");
                if (bundle2 != null) {
                    bundle = bundle2;
                }
                C880756q r1 = this.A03;
                if (r1.A08() == null) {
                    Parcelable parcelable = bundle.getParcelable("financial_entity");
                    if (parcelable == null || (obj = C121697Hn.A01(parcelable)) == null) {
                        List list = this.A02;
                        if (list == null) {
                            C04220Ms.A0E("financialEntities");
                            throw null;
                        }
                        obj = AnonymousClass00J.A0C(list);
                    }
                    r1.A0H(obj);
                    return;
                }
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
