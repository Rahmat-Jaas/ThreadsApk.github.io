package com.facebook.redex;

import X.AnonymousClass0ZU;
import X.AnonymousClass1l3;
import X.AnonymousClass3IU;
import X.AnonymousClass5xZ;
import X.C04220Ms;
import X.C11630kW;
import X.C121907Is;
import X.C171209wF;
import X.C18180wK;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C202313q;
import X.C37350Jpy;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.facebook.pando.TreeJNI;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;

public class IDxCSpanShape1S0300000_1_I2 extends ClickableSpan {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCSpanShape1S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        C37350Jpy jpy;
        String str;
        String A0Y;
        switch (this.A03) {
            case 0:
                jpy = new C37350Jpy((Context) this.A00, (UserSession) this.A02, C171209wF.A0d, "https://help.instagram.com/517073653436611?helpref=faq_content");
                str = ((C11630kW) this.A01).getModuleName();
                break;
            case 1:
                KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2 = (KtCSuperShape0S2200000_I2) this.A01;
                AnonymousClass0ZU r0 = (AnonymousClass0ZU) ktCSuperShape0S2200000_I2.A00;
                if (r0 != null) {
                    r0.invoke();
                }
                jpy = C18230wP.A0Y((Activity) this.A00, (UserSession) this.A02, (C171209wF) ktCSuperShape0S2200000_I2.A01, ktCSuperShape0S2200000_I2.A03);
                str = AnonymousClass5xZ.__redex_internal_original_name;
                break;
            default:
                AnonymousClass3IU r6 = ((AnonymousClass1l3) this.A02).A02;
                TreeJNI treeJNI = (TreeJNI) this.A01;
                String A0m = C18220wO.A0m(treeJNI);
                if (A0m != null) {
                    String A0l = C18220wO.A0l(treeJNI);
                    if (A0l != null) {
                        TreeJNI treeValue = treeJNI.getTreeValue("profile_picture(scale:1,width:100)", FBCommentImpl.Body.Ranges.Entity.InlineXFBUser.ProfilePicture100.class);
                        if (treeValue == null || (A0Y = C18250wR.A0Y(treeValue)) == null) {
                            throw C18180wK.A0a("Required value was null.");
                        }
                        r6.A03(A0m, A0l, A0Y);
                        return;
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
        }
        jpy.A07(str);
        jpy.A04();
    }

    public final void updateDrawState(TextPaint textPaint) {
        Context context;
        int i;
        switch (this.A03) {
            case 0:
                C04220Ms.A0B(textPaint, 0);
                context = (Context) this.A00;
                i = R.color.igds_link;
                break;
            case 1:
                C18240wQ.A0t(textPaint);
                context = (Context) this.A00;
                i = C121907Is.A02(context, R.attr.textColorRegularLink);
                break;
            default:
                C04220Ms.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(((C202313q) this.A00).A00.getColor(R.color.igds_primary_text));
                textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                return;
        }
        textPaint.setColor(context.getColor(i));
    }
}
