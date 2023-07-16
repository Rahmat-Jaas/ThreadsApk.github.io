package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.8DJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8DJ extends AnonymousClass019 implements AnonymousClass0ZU {
    public final /* synthetic */ ComposeView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8DJ(ComposeView composeView) {
        super(0, C04250Mv.class, "drawToBitmap", "eventEmojiDrawToBitmapWrapper$drawToBitmap(Landroidx/compose/ui/platform/ComposeView;)Landroid/graphics/Bitmap;", 0);
        this.A00 = composeView;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ComposeView composeView = this.A00;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        C04220Ms.A0B(composeView, 0);
        if (composeView.isLaidOut()) {
            Bitmap createBitmap = Bitmap.createBitmap(composeView.getWidth(), composeView.getHeight(), config);
            C04220Ms.A06(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) composeView.getScrollX()), -((float) composeView.getScrollY()));
            composeView.draw(canvas);
            return createBitmap;
        }
        throw C18180wK.A0a("View needs to be laid out before calling drawToBitmap()");
    }
}
