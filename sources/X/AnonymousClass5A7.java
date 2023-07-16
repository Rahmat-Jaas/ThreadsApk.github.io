package X;

import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape167S0100000_I2;

/* renamed from: X.5A7  reason: invalid class name */
public final class AnonymousClass5A7 extends C41030Luu {
    public final Context A00;
    public final AnonymousClass773 A01;
    public final C11630kW A02;
    public final UserSession A03;
    public final AnonymousClass0YP A04;

    public AnonymousClass5A7(Context context, JWT jwt, C11630kW r6, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        KtLambdaShape167S0100000_I2 A0u = C86164wN.A0u(this, 27);
        this.A04 = A0u;
        AnonymousClass773 r0 = new AnonymousClass773(jwt, this);
        this.A01 = r0;
        r0.A09.add(new C124987cE(A0u));
        this.A02 = r6;
        this.A03 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        C89035Bq r3 = new C89035Bq(C18200wM.A0F(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_clips_grid_item, false), this);
        Context context = this.A00;
        C04220Ms.A0B(context, 0);
        Size size = new Size(AnonymousClass6PZ.A00(context), AnonymousClass8bA.A02(((float) AnonymousClass6PZ.A00(context)) / 0.5625f));
        C09860go.A0Y(r3.itemView, size.getWidth());
        C09860go.A0O(r3.itemView, size.getHeight());
        return r3;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        Object obj;
        ImageUrl A22;
        C89035Bq r7 = (C89035Bq) m5o;
        C04220Ms.A0B(r7, 0);
        AnonymousClass773 r0 = this.A01;
        AnonymousClass89E r1 = r0.A02;
        AnonymousClass89E r02 = r0.A01;
        if (r1 != null) {
            obj = r1.get(i);
        } else if (r02 != null) {
            r02.A02(i);
            obj = r02.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        AnonymousClass9CZ r5 = (AnonymousClass9CZ) obj;
        if (r5 != null) {
            IgImageButton igImageButton = r7.A02;
            igImageButton.A00 = 0.5625f;
            BKU bku = r5.A01;
            if (!(bku == null || (A22 = bku.A22()) == null)) {
                igImageButton.setUrl(A22, r7.A03.A02);
            }
            igImageButton.setContentDescription(C18190wL.A0h(r7.itemView.getResources(), r5.A0B(r7.A03.A03), 2131834533));
            r7.A01.setText(C1189372w.A00(r7.itemView.getResources(), Integer.valueOf(r5.A07), false));
            r7.A00.setVisibility(0);
        }
    }

    public final int getItemCount() {
        int size;
        int A032 = C14030oh.A03(1087864108);
        AnonymousClass773 r1 = this.A01;
        AnonymousClass89E r0 = r1.A02;
        if (r0 == null && (r0 = r1.A01) == null) {
            size = 0;
        } else {
            size = r0.size();
        }
        C14030oh.A0A(231148461, A032);
        return size;
    }
}
