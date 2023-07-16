package com.instagram.debug.devoptions.igns;

import X.AnonymousClass0wJ;
import X.AnonymousClass1lO;
import X.C04220Ms;
import X.C09860go;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C31084GfL;
import X.C41882MfV;
import X.M5O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InternalIgNotificationRowDefinition extends AnonymousClass1lO {
    public final Delegate delegate;

    public interface Delegate {
        void onRowClicked(C31084GfL gfL);
    }

    public final class IgNotificationCell extends IgLinearLayout {
        public final IgTextView collapseKey;
        public final IgTextView message;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public IgNotificationCell(Context context) {
            this(context, (AttributeSet) null, 0);
            C04220Ms.A0B(context, 1);
        }

        public final IgTextView getCollapseKey() {
            return this.collapseKey;
        }

        public final IgTextView getMessage() {
            return this.message;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IgNotificationCell(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            C04220Ms.A0B(context, 1);
            setOrientation(1);
            View inflate = IgLinearLayout.inflate(context, R.layout.internal_notification_cell, this);
            C09860go.A0d(inflate, R.dimen.abc_floating_window_z, R.dimen.abc_button_padding_horizontal_material, R.dimen.abc_floating_window_z, R.dimen.abc_button_padding_horizontal_material);
            this.collapseKey = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.ig_notification_collapse_key);
            this.message = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.ig_notification_message);
        }

        public /* synthetic */ IgNotificationCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public IgNotificationCell(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
            C04220Ms.A0B(context, 1);
        }
    }

    public final class IgNotificationViewHolder extends M5O {
        public final IgNotificationCell notificationCell;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IgNotificationViewHolder(IgNotificationCell igNotificationCell) {
            super(igNotificationCell);
            C04220Ms.A0B(igNotificationCell, 1);
            this.notificationCell = igNotificationCell;
        }

        public final IgNotificationCell getNotificationCell() {
            return this.notificationCell;
        }
    }

    public final class IgNotificationViewModel implements C41882MfV {
        public final C31084GfL notification;

        public IgNotificationViewModel(C31084GfL gfL) {
            C04220Ms.A0B(gfL, 1);
            this.notification = gfL;
        }

        public final C31084GfL getNotification() {
            return this.notification;
        }

        public boolean isContentSame(IgNotificationViewModel igNotificationViewModel) {
            String str;
            C31084GfL gfL;
            String str2 = this.notification.A0R;
            if (igNotificationViewModel == null || (gfL = igNotificationViewModel.notification) == null) {
                str = null;
            } else {
                str = gfL.A0R;
            }
            return C04220Ms.A0I(str2, str);
        }

        public String getKey() {
            String str = this.notification.A0i;
            C04220Ms.A06(str);
            return str;
        }
    }

    public InternalIgNotificationRowDefinition(Delegate delegate2) {
        C04220Ms.A0B(delegate2, 1);
        this.delegate = delegate2;
    }

    public Class modelClass() {
        return IgNotificationViewModel.class;
    }

    public void bind(IgNotificationViewModel igNotificationViewModel, IgNotificationViewHolder igNotificationViewHolder) {
        AnonymousClass0wJ.A1N(igNotificationViewModel, igNotificationViewHolder);
        IgTextView igTextView = igNotificationViewHolder.notificationCell.collapseKey;
        String str = igNotificationViewModel.notification.A0M;
        if (str == null) {
            str = InternalIgNotificationConstantsKt.NOT_SET;
        }
        igTextView.setText(str);
        IgTextView igTextView2 = igNotificationViewHolder.notificationCell.message;
        String str2 = igNotificationViewModel.notification.A0c;
        if (str2 == null) {
            str2 = InternalIgNotificationConstantsKt.NOT_SET;
        }
        igTextView2.setText(str2);
        igNotificationViewHolder.notificationCell.setOnClickListener(new InternalIgNotificationRowDefinition$bind$1(this, igNotificationViewModel));
    }

    public IgNotificationViewHolder createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new IgNotificationViewHolder(new IgNotificationCell(C18190wL.A0A(viewGroup), (AttributeSet) null, C18200wM.A1Y(viewGroup) ? 1 : 0));
    }
}
