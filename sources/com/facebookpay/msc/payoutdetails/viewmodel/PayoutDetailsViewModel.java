package com.facebookpay.msc.payoutdetails.viewmodel;

import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5iC;
import X.AnonymousClass5iL;
import X.AnonymousClass5iR;
import X.AnonymousClass5k7;
import X.AnonymousClass67O;
import X.AnonymousClass69Q;
import X.AnonymousClass6IH;
import X.AnonymousClass6XU;
import X.AnonymousClass7E5;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass8H1;
import X.C04220Ms;
import X.C04530Oa;
import X.C111476nk;
import X.C114986uF;
import X.C121187Eo;
import X.C121277Fh;
import X.C121697Hn;
import X.C121777Ib;
import X.C128067iI;
import X.C128077iJ;
import X.C128097is;
import X.C128107it;
import X.C128377jT;
import X.C128387jU;
import X.C143688h9;
import X.C146928n6;
import X.C146998nD;
import X.C148448r4;
import X.C148458r5;
import X.C148528rE;
import X.C18180wK;
import X.C18240wQ;
import X.C18250wR;
import X.C86114wI;
import X.C86134wK;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.C92375iF;
import X.C92465iX;
import X.C968066t;
import X.M5J;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.redex.IDxFunctionShape0S2100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.HashMap;

public final class PayoutDetailsViewModel extends ListSectionViewModel {
    public C148528rE A00;
    public AnonymousClass7Kx A01 = AnonymousClass7Kx.A01();
    public ImmutableList A02;
    public String A03;
    public LoggingData A04;
    public final C880756q A05 = C880756q.A01();
    public final C04530Oa A06 = AnonymousClass0OY.A02(AnonymousClass8H1.A00);

    public final void A07(Bundle bundle) {
        String str;
        LoggingData loggingData;
        Object A012;
        String str2;
        String str3;
        AnonymousClass67O r1;
        C146998nD r12;
        C128097is r9;
        C128067iI r13;
        String str4;
        C121777Ib r15;
        String str5;
        String B0k;
        String B0j;
        String B0j2;
        Bundle bundle2 = bundle;
        super.A07(bundle2);
        String str6 = null;
        if (bundle != null) {
            str = bundle2.getString("financial_entity_id");
        } else {
            str = null;
        }
        if (str != null) {
            this.A03 = str;
            if (bundle == null || (loggingData = (LoggingData) bundle2.getParcelable("logging_data")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            this.A04 = loggingData;
            Parcelable parcelable = bundle2.getParcelable("payout_batch_item");
            if (parcelable == null || (A012 = C121697Hn.A01(parcelable)) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            C148528rE r0 = (C148528rE) A012;
            this.A00 = r0;
            C880856r r4 = this.A07;
            if (r0 == null) {
                C04220Ms.A0E("payoutActivityItem");
                throw null;
            }
            C148448r4 B0d = r0.B0d();
            if (B0d != null) {
                str6 = B0d.B0c();
            }
            r4.A0H(new C114986uF(C128107it.A01(str6), C86134wK.A0T(), false));
            ImmutableList.Builder builder = ImmutableList.builder();
            C148528rE r02 = this.A00;
            String str7 = "payoutActivityItem";
            if (r02 != null) {
                C148458r5 B0l = r02.B0l();
                if (B0l != null) {
                    str2 = B0l.B0k();
                } else {
                    str2 = null;
                }
                C128107it A013 = C128107it.A01(str2);
                C148528rE r03 = this.A00;
                if (r03 != null) {
                    C148458r5 B0l2 = r03.B0l();
                    if (B0l2 != null) {
                        str3 = B0l2.B0j();
                    } else {
                        str3 = null;
                    }
                    C128107it A014 = C128107it.A01(str3);
                    C148528rE r04 = this.A00;
                    if (r04 != null) {
                        C148458r5 B0l3 = r04.B0l();
                        if (B0l3 != null) {
                            r1 = B0l3.B0b();
                        } else {
                            r1 = null;
                        }
                        if (r1 == AnonymousClass67O.PAYPAL) {
                            r12 = new C128067iI((Integer) null, (Integer) null, R.drawable.payment_paypal, 0);
                            C148528rE r05 = this.A00;
                            if (r05 == null) {
                                C04220Ms.A0E(str7);
                                throw null;
                            }
                            C148458r5 B0l4 = r05.B0l();
                            if (B0l4 == null || (B0j2 = B0l4.B0j()) == null) {
                                throw C18180wK.A0a("Required value was null.");
                            }
                            r9 = C128097is.A00(new Object[]{B0j2}, 2131832343);
                            r13 = null;
                        } else {
                            r12 = new C128077iJ(5, 4, 0, 1);
                            r13 = new C128067iI((Integer) null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
                            C148528rE r06 = this.A00;
                            if (r06 == null) {
                                C04220Ms.A0E(str7);
                                throw null;
                            }
                            C148458r5 B0l5 = r06.B0l();
                            if (B0l5 == null || (B0k = B0l5.B0k()) == null) {
                                throw C18180wK.A0a("Required value was null.");
                            }
                            C148528rE r07 = this.A00;
                            if (r07 == null) {
                                C04220Ms.A0E(str7);
                                throw null;
                            }
                            C148458r5 B0l6 = r07.B0l();
                            if (B0l6 == null || (B0j = B0l6.B0j()) == null) {
                                throw C18180wK.A0a("Required value was null.");
                            }
                            r9 = C128097is.A00(new Object[]{B0k, B0j}, 2131832342);
                        }
                        AnonymousClass5iR A002 = AnonymousClass5iR.A00(23);
                        C92375iF A003 = C92375iF.A00();
                        C148528rE r08 = this.A00;
                        if (r08 == null) {
                            C04220Ms.A0E(str7);
                            throw null;
                        }
                        C148448r4 B0d2 = r08.B0d();
                        if (B0d2 != null) {
                            str4 = B0d2.B0r();
                        } else {
                            str4 = null;
                        }
                        C128107it A015 = C128107it.A01(str4);
                        AnonymousClass69Q r14 = AnonymousClass69Q.A19;
                        C121777Ib.A02(A015, A003, r14);
                        C148528rE r09 = this.A00;
                        if (r09 == null) {
                            C04220Ms.A0E(str7);
                            throw null;
                        }
                        if (r09.B0P() != null) {
                            C148528rE r010 = this.A00;
                            if (r010 == null) {
                                C04220Ms.A0E(str7);
                                throw null;
                            }
                            String B0P = r010.B0P();
                            C18240wQ.A1I(B0P);
                            r15 = new C121777Ib((C146998nD) null, C128097is.A00(new Object[]{B0P}, 2131832193), AnonymousClass69Q.A0z);
                        } else {
                            r15 = null;
                        }
                        A003.A02 = r15;
                        A002.A05 = new AnonymousClass5iL(A003);
                        A002.A02 = 1;
                        C92375iF A004 = C92375iF.A00();
                        C111476nk r152 = AnonymousClass6XU.A00;
                        C148528rE r011 = this.A00;
                        if (r011 == null) {
                            C04220Ms.A0E(str7);
                            throw null;
                        }
                        C968066t B0X = r011.B0X();
                        if (B0X != null) {
                            C148528rE r012 = this.A00;
                            if (r012 == null) {
                                C04220Ms.A0E(str7);
                                throw null;
                            }
                            String B0Z = r012.B0Z();
                            if (B0Z != null) {
                                A004.A04 = r152.A00(C128107it.A01(B0Z), B0X);
                                A002.A06 = new AnonymousClass5iL(A004);
                                C92465iX.A01(A002, builder);
                                AnonymousClass5iR A005 = AnonymousClass5iR.A00(0);
                                C92375iF A006 = C92375iF.A00();
                                C121777Ib.A02(C128097is.A00(new Object[0], 2131832260), A006, r14);
                                C92465iX A007 = AnonymousClass5iL.A00(A005, A006);
                                AnonymousClass5iR A008 = AnonymousClass5iR.A00(3);
                                AnonymousClass5iC r013 = new AnonymousClass5iC();
                                r013.A01 = r12;
                                r013.A00 = r13;
                                C92375iF A022 = C128387jU.A02(r013, A008);
                                C121777Ib.A02(A013, A022, AnonymousClass69Q.PRIMARY_TEXT);
                                AnonymousClass69Q r5 = AnonymousClass69Q.A0z;
                                A008.A05 = C121777Ib.A00(A014, A022, r5);
                                A008.A02 = 1;
                                C121187Eo r18 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
                                r18.A01 = r9;
                                r18.A04 = false;
                                A008.A02 = new AnonymousClass7E5(r18);
                                builder.add((Object[]) new C128377jT[]{A007, new C92465iX(A008)});
                                AnonymousClass5iR A009 = AnonymousClass5iR.A00(1);
                                C92375iF A0010 = C92375iF.A00();
                                C148528rE r014 = this.A00;
                                if (r014 == null) {
                                    C04220Ms.A0E(str7);
                                    throw null;
                                }
                                C148448r4 B0d3 = r014.B0d();
                                if (B0d3 != null) {
                                    str5 = B0d3.B0q();
                                } else {
                                    str5 = null;
                                }
                                C121777Ib.A02(C128107it.A01(str5), A0010, r5);
                                builder.add((Object) AnonymousClass5iL.A00(A009, A0010));
                                this.A02 = C18250wR.A0F(builder);
                                C880756q r52 = this.A05;
                                Object value = this.A06.getValue();
                                String str8 = this.A03;
                                if (str8 == null) {
                                    str7 = "financialEntityId";
                                } else {
                                    C148528rE r015 = this.A00;
                                    if (r015 != null) {
                                        String id = r015.getId();
                                        if (id != null) {
                                            M5J A0011 = AnonymousClass5k7.A00(new IDxFunctionShape0S2100000_2_I2(value, str8, id, 1), AnonymousClass7Kz.A0C());
                                            C04220Ms.A06(A0011);
                                            C121277Fh.A02(A0011, r52, C86114wI.A0Q(this, 108));
                                            return;
                                        }
                                        throw C18180wK.A0a("Required value was null.");
                                    }
                                }
                                C04220Ms.A0E(str7);
                                throw null;
                            }
                            throw C18180wK.A0a("Required value was null.");
                        }
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
            }
            C04220Ms.A0E(str7);
            throw null;
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final void A00(PayoutDetailsViewModel payoutDetailsViewModel, String str, boolean z) {
        String str2;
        C143688h9 A08 = AnonymousClass7Kz.A08();
        LoggingData loggingData = payoutDetailsViewModel.A04;
        if (loggingData == null) {
            str2 = "loggingData";
        } else {
            HashMap A002 = AnonymousClass6IH.A00(loggingData);
            String str3 = payoutDetailsViewModel.A03;
            if (str3 == null) {
                str2 = "financialEntityId";
            } else {
                C86164wN.A1I(str3, A002);
                A002.put("view_name", "payout_details");
                if (z) {
                    C148528rE r0 = payoutDetailsViewModel.A00;
                    if (r0 == null) {
                        str2 = "payoutActivityItem";
                    } else {
                        String valueOf = String.valueOf(r0.B0P());
                        if (valueOf != null) {
                            A002.put("batch_item_id", valueOf);
                        } else {
                            throw AnonymousClass0wJ.A0b();
                        }
                    }
                }
                A08.Bb8(str, A002);
                return;
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }
}
