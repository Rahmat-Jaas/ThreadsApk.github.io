package com.instagram.groupprofiles.fragment;

import X.AnonymousClass006;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass5IW;
import X.AnonymousClass5xV;
import X.C108286i7;
import X.C13950oZ;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C25828Dsm;
import X.C39142Kno;
import X.C63813iO;
import X.C64493mQ;
import X.C86154wM;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.facebook.redex.IDxDListenerShape321S0100000_2_I2;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.textcell.IgdsActionCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.groupprofiles.fragment.GroupProfileEditorFragment$onViewCreated$12$1", f = "GroupProfileEditorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GroupProfileEditorFragment$onViewCreated$12$1 extends C39142Kno implements AnonymousClass0YP {
    public /* synthetic */ Object A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ TextView A04;
    public final /* synthetic */ AnonymousClass5xV A05;
    public final /* synthetic */ IgdsButton A06;
    public final /* synthetic */ IgdsButton A07;
    public final /* synthetic */ IgFormField A08;
    public final /* synthetic */ IgFormField A09;
    public final /* synthetic */ IgFormField A0A;
    public final /* synthetic */ IgdsActionCell A0B;
    public final /* synthetic */ IgdsListCell A0C;
    public final /* synthetic */ IgdsListCell A0D;
    public final /* synthetic */ IgdsListCell A0E;
    public final /* synthetic */ C64493mQ A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupProfileEditorFragment$onViewCreated$12$1(TextView textView, TextView textView2, TextView textView3, TextView textView4, AnonymousClass5xV r7, IgdsButton igdsButton, IgdsButton igdsButton2, IgFormField igFormField, IgFormField igFormField2, IgFormField igFormField3, IgdsActionCell igdsActionCell, IgdsListCell igdsListCell, IgdsListCell igdsListCell2, IgdsListCell igdsListCell3, C64493mQ r17, C146958n9 r18) {
        super(2, r18);
        this.A05 = r7;
        this.A02 = textView;
        this.A09 = igFormField;
        this.A08 = igFormField2;
        this.A0A = igFormField3;
        this.A0B = igdsActionCell;
        this.A07 = igdsButton;
        this.A06 = igdsButton2;
        this.A0D = igdsListCell;
        this.A04 = textView2;
        this.A03 = textView3;
        this.A0C = igdsListCell2;
        this.A01 = textView4;
        this.A0E = igdsListCell3;
        this.A0F = r17;
    }

    public final C146958n9 create(Object obj, C146958n9 r20) {
        AnonymousClass5xV r6 = this.A05;
        TextView textView = this.A02;
        IgFormField igFormField = this.A09;
        IgFormField igFormField2 = this.A08;
        IgFormField igFormField3 = this.A0A;
        IgdsActionCell igdsActionCell = this.A0B;
        IgdsButton igdsButton = this.A07;
        IgdsButton igdsButton2 = this.A06;
        IgdsListCell igdsListCell = this.A0D;
        TextView textView2 = this.A04;
        TextView textView3 = this.A03;
        IgdsListCell igdsListCell2 = this.A0C;
        GroupProfileEditorFragment$onViewCreated$12$1 groupProfileEditorFragment$onViewCreated$12$1 = new GroupProfileEditorFragment$onViewCreated$12$1(textView, textView2, textView3, this.A01, r6, igdsButton, igdsButton2, igFormField, igFormField2, igFormField3, igdsActionCell, igdsListCell, igdsListCell2, this.A0E, this.A0F, r20);
        groupProfileEditorFragment$onViewCreated$12$1.A00 = obj;
        return groupProfileEditorFragment$onViewCreated$12$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupProfileEditorFragment$onViewCreated$12$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass5xV r2;
        Context context;
        Context context2;
        AnonymousClass0OU.A00(obj);
        AnonymousClass5IW r3 = (AnonymousClass5IW) this.A00;
        if (r3.A0C || r3.A0E) {
            r2 = this.A05;
        } else {
            User user = r3.A02;
            if (user != null) {
                r2 = this.A05;
                C108286i7 r0 = r2.A02;
                if (r0 != null) {
                    r0.A01.invoke(user);
                }
            } else {
                if (r3.A0B) {
                    AnonymousClass5xV r1 = this.A05;
                    AnonymousClass5xV.A00(r1).A0D();
                    C63813iO.A03(r1.getContext(), (String) null, 2131827947, 0);
                }
                if (r3.A0I) {
                    AnonymousClass5xV r4 = this.A05;
                    if (r4.A00 == null && (context2 = r4.getContext()) != null) {
                        C25828Dsm dsm = new C25828Dsm(context2);
                        dsm.A0L(2131828080);
                        dsm.A0K(2131828079);
                        dsm.A0P(C86154wM.A0N(r4, 54), 2131824397);
                        dsm.A0N((DialogInterface.OnClickListener) null, 2131823054);
                        dsm.A0r(true);
                        dsm.A0e(new IDxDListenerShape321S0100000_2_I2(r4, 7));
                        Dialog A0G = dsm.A0G();
                        C13950oZ.A00(A0G);
                        r4.A00 = A0G;
                    }
                }
                if (r3.A0J) {
                    AnonymousClass5xV r42 = this.A05;
                    if (r42.A01 == null && (context = r42.getContext()) != null) {
                        C25828Dsm dsm2 = new C25828Dsm(context);
                        dsm2.A0L(2131828077);
                        dsm2.A0K(2131828076);
                        dsm2.A0P((DialogInterface.OnClickListener) null, 2131828075);
                        dsm2.A0N(C86154wM.A0N(r42, 55), 2131823054);
                        dsm2.A0r(true);
                        dsm2.A0e(new IDxDListenerShape321S0100000_2_I2(r42, 8));
                        Dialog A0G2 = dsm2.A0G();
                        C13950oZ.A00(A0G2);
                        r42.A01 = A0G2;
                    }
                }
                TextView textView = this.A02;
                boolean z = r3.A0H;
                int i = 8;
                textView.setVisibility(C18190wL.A00(z ? 1 : 0));
                String str = r3.A04;
                IgFormField igFormField = this.A09;
                if (str != null) {
                    C64493mQ r22 = this.A0F;
                    AnonymousClass5xV r12 = this.A05;
                    igFormField.A00.removeTextChangedListener(r22);
                    igFormField.setText(str);
                    igFormField.A00.addTextChangedListener(r22);
                    r12.getContext();
                    igFormField.setLabelText(r12.getString(((AnonymousClass5IW) AnonymousClass5xV.A00(r12).A0G.getValue()).A00));
                } else {
                    igFormField.A04();
                }
                igFormField.setVisibility(C18190wL.A00(r3.A08 ? 1 : 0));
                this.A08.setVisibility(C18190wL.A00(r3.A06 ? 1 : 0));
                this.A0A.setVisibility(C18190wL.A00(r3.A0A ? 1 : 0));
                IgdsActionCell igdsActionCell = this.A0B;
                int i2 = 8;
                if (!z) {
                    i2 = 0;
                }
                igdsActionCell.setVisibility(i2);
                Integer num = r3.A03;
                Integer num2 = AnonymousClass006.A0C;
                boolean z2 = true;
                igdsActionCell.setEnabled(C18240wQ.A1Y(num, num2));
                this.A07.setVisibility(C18190wL.A00(z));
                IgdsButton igdsButton = this.A06;
                int i3 = 2131826219;
                if (z) {
                    i3 = 2131828060;
                }
                igdsButton.setText(i3);
                igdsButton.setLoading(C18180wK.A1Z(num, num2));
                if (num != AnonymousClass006.A01) {
                    z2 = false;
                }
                igdsButton.setEnabled(z2);
                IgdsListCell igdsListCell = this.A0D;
                igdsListCell.setEnabled(r3.A07);
                igdsListCell.setChecked(r3.A0F);
                this.A04.setVisibility(C18190wL.A00(z));
                this.A03.setVisibility(C18190wL.A00(z));
                IgdsListCell igdsListCell2 = this.A0C;
                boolean z3 = r3.A05;
                igdsListCell2.setVisibility(C18190wL.A00(z3 ? 1 : 0));
                igdsListCell2.setEnabled(z3);
                igdsListCell2.setChecked(r3.A0D);
                this.A01.setVisibility(C18190wL.A00(z3));
                IgdsListCell igdsListCell3 = this.A0E;
                if (!z && r3.A09) {
                    i = 0;
                }
                igdsListCell3.setVisibility(i);
                igdsListCell3.setChecked(r3.A0G);
                return Unit.A00;
            }
        }
        C108286i7 r02 = r2.A02;
        if (r02 != null) {
            r02.A00.invoke();
        }
        return Unit.A00;
    }
}
