package com.facebook.redex;

import X.AnonymousClass52I;
import X.AnonymousClass52P;
import X.AnonymousClass5qq;
import X.C04220Ms;
import X.C106956fu;
import X.C114916u7;
import X.C40963Lt2;
import X.C86154wM;
import X.C86164wN;
import X.M6d;
import android.app.Dialog;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebookpay.widget.listcell.ListCell;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.barcelona.R;
import java.util.List;

public class IDxLListenerShape127S0200000_2_I2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLListenerShape127S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void onGlobalLayout() {
        List list;
        ConstraintLayout constraintLayout;
        switch (this.A02) {
            case 0:
                AnonymousClass52P r1 = (AnonymousClass52P) this.A01;
                C86154wM.A1J(r1, this);
                C114916u7 r0 = ((C106956fu) this.A00).A01;
                if (!(r0 == null || (list = r0.A01) == null)) {
                    r1.A00(list);
                }
                r1.getProgressDrawable().setBounds(r1.getProgressDrawable().getBounds().left, r1.getProgressDrawable().getBounds().top + 20, r1.getProgressDrawable().getBounds().right, r1.getProgressDrawable().getBounds().bottom - 20);
                return;
            case 3:
                TextView textView = (TextView) this.A01;
                C86154wM.A1J(textView, this);
                ListCell listCell = (ListCell) this.A00;
                int lineCount = textView.getLineCount();
                View view = listCell.A01;
                if (view == null) {
                    C04220Ms.A0E("containerView");
                    throw null;
                } else if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                    M6d m6d = new M6d();
                    m6d.A0I(constraintLayout);
                    if (lineCount <= 1 && listCell.getSecondaryText() == null && listCell.getTertiaryText() == null && listCell.getQuaternaryText() == null && listCell.getTertiaryLinkableText() == null && listCell.getQuaternaryLinkableText() == null && listCell.getSecondarySpannableText() == null && listCell.getTertiarySpannableText() == null) {
                        m6d.A0F(R.id.primary_text, 3, R.id.image, 4, 0);
                        m6d.A0F(R.id.primary_text, 4, R.id.image, 3, 0);
                        C40963Lt2 lt2 = (C40963Lt2) C86164wN.A0c(m6d.A00, R.id.primary_text);
                        if (lt2 != null) {
                            lt2.A03.A05 = 0.5f;
                        }
                    } else {
                        m6d.A0E(R.id.primary_text, 3, R.id.image, 3);
                    }
                    m6d.A0G(constraintLayout);
                    return;
                } else {
                    return;
                }
            default:
                AnonymousClass5qq r6 = (AnonymousClass5qq) this.A01;
                ConstraintLayout constraintLayout2 = r6.A04;
                if (constraintLayout2 != null) {
                    if (constraintLayout2.getMeasuredWidth() != 0) {
                        ConstraintLayout constraintLayout3 = r6.A04;
                        if (constraintLayout3 != null) {
                            if (constraintLayout3.getMeasuredHeight() != 0) {
                                AnonymousClass52I r02 = (AnonymousClass52I) ((Dialog) this.A00);
                                AnonymousClass52I.A02(r02);
                                BottomSheetBehavior bottomSheetBehavior = r02.A03;
                                ConstraintLayout constraintLayout4 = r6.A04;
                                if (constraintLayout4 != null) {
                                    bottomSheetBehavior.A0H((int) (((double) constraintLayout4.getMeasuredHeight()) * 0.75d));
                                    ConstraintLayout constraintLayout5 = r6.A04;
                                    if (constraintLayout5 != null) {
                                        C86154wM.A1J(constraintLayout5, this);
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                C04220Ms.A0E("viewContainer");
                throw null;
        }
    }
}
