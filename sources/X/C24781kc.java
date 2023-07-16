package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape8S1200000_1_I2;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.model.User;

/* renamed from: X.1kc  reason: invalid class name and case insensitive filesystem */
public final class C24781kc extends AnonymousClass1lO {
    public final C82524pq A00;

    public final Class modelClass() {
        return AnonymousClass48Q.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48Q r9 = (AnonymousClass48Q) mfV;
        AnonymousClass12B r10 = (AnonymousClass12B) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r9, r10);
        FanClubCategoryType fanClubCategoryType = r9.A00;
        String str = r9.A04;
        String str2 = r9.A03;
        User user = r9.A02;
        User user2 = r9.A01;
        C82524pq r3 = this.A00;
        IgdsPeopleCell igdsPeopleCell = r10.A00;
        igdsPeopleCell.A09(str, A1Y);
        igdsPeopleCell.A08(str2);
        igdsPeopleCell.A03(user.B4M(), user2.B4M());
        igdsPeopleCell.setOnClickListener(new IDxCListenerShape8S1200000_1_I2((Object) fanClubCategoryType, (Object) r3, str, 9));
    }

    public C24781kc(C82524pq r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1Y = C18200wM.A1Y(viewGroup);
        return new AnonymousClass12B(new IgdsPeopleCell(C18190wL.A0A(viewGroup), (AttributeSet) null, A1Y ? 1 : 0, A1Y));
    }
}
