package X;

/* renamed from: X.8QK  reason: invalid class name */
public final class AnonymousClass8QK extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QK A00 = new AnonymousClass8QK();

    public AnonymousClass8QK() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2 = ((com.facebook.pando.TreeJNI) r2).getIntValue("ig_id");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r21
            X.8gY r0 = (X.C143338gY) r0
            r5 = 0
            X.C04220Ms.A0B(r0, r5)
            com.facebook.pando.TreeJNI r2 = X.C685344e.A03(r0)
            if (r2 == 0) goto L_0x010f
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer> r1 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.class
            java.lang.String r0 = "xfb_shops_viewer"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x010f
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart> r1 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.class
            java.lang.String r0 = "cart"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x010f
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts> r1 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.class
            java.lang.String r0 = "merchant_carts"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x010f
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges> r0 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.class
            java.lang.String r4 = "edges"
            com.google.common.collect.ImmutableList r1 = r1.getTreeList(r4, r0)
            if (r1 == 0) goto L_0x010f
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r11 = r1.iterator()
        L_0x003e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0111
            com.facebook.pando.TreeJNI r8 = X.C18210wN.A0G(r11)
            if (r8 == 0) goto L_0x003e
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node> r7 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.class
            java.lang.String r6 = "node"
            com.facebook.pando.TreeJNI r3 = r8.getTreeValue(r6, r7)
            if (r3 == 0) goto L_0x00b9
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Merchant> r2 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Merchant.class
            java.lang.String r1 = "merchant"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            X.8q5 r2 = (X.C147888q5) r2
            if (r2 == 0) goto L_0x00b9
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r1 = "ig_id"
            int r2 = r2.getIntValue(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x00b9
            if (r2 <= 0) goto L_0x00b9
            java.lang.String r1 = r1.toString()
        L_0x0074:
            r2 = 0
            if (r1 == 0) goto L_0x003e
            com.facebook.pando.TreeJNI r10 = r8.getTreeValue(r6, r7)
            if (r10 == 0) goto L_0x003e
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Merchant> r9 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Merchant.class
            java.lang.String r3 = "merchant"
            com.facebook.pando.TreeJNI r3 = r10.getTreeValue(r3, r9)
            X.8q5 r3 = (X.C147888q5) r3
            if (r3 == 0) goto L_0x003e
            com.instagram.model.shopping.Merchant r13 = X.C19489AxC.createMerchant(r3, r1)
            com.facebook.pando.TreeJNI r3 = r8.getTreeValue(r6, r7)
            if (r3 == 0) goto L_0x009d
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Products> r2 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Products.class
            java.lang.String r1 = "products"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            X.8q6 r2 = (X.C147898q6) r2
        L_0x009d:
            java.util.List r18 = X.C19489AxC.createShoppingCartItem(r2, r13)
            r14 = 0
            X.ANr r16 = new X.ANr
            r16.<init>()
            X.75k r15 = new X.75k
            r15.<init>()
            X.AvY r12 = new X.AvY
            r17 = r14
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.add(r12)
            goto L_0x003e
        L_0x00b9:
            com.facebook.pando.TreeJNI r3 = r8.getTreeValue(r6, r7)
            if (r3 == 0) goto L_0x003e
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Products> r2 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Products.class
            java.lang.String r1 = "products"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            X.8q6 r2 = (X.C147898q6) r2
            if (r2 == 0) goto L_0x003e
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Products$ProductsEdges> r1 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Products.ProductsEdges.class
            com.google.common.collect.ImmutableList r1 = r2.getTreeList(r4, r1)
            if (r1 == 0) goto L_0x003e
            java.util.Iterator r9 = r1.iterator()
        L_0x00d9:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x003e
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r9)
            if (r2 == 0) goto L_0x00d9
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Products$ProductsEdges$ProductsEdgesNode> r1 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Products.ProductsEdges.ProductsEdgesNode.class
            com.facebook.pando.TreeJNI r3 = r2.getTreeValue(r6, r1)
            if (r3 == 0) goto L_0x00d9
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Products$ProductsEdges$ProductsEdgesNode$Product> r2 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Products.ProductsEdges.ProductsEdgesNode.Product.class
            java.lang.String r1 = "product"
            com.facebook.pando.TreeJNI r3 = r3.getTreeValue(r1, r2)
            if (r3 == 0) goto L_0x00d9
            java.lang.Class<com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl$XfbShopsViewer$Cart$MerchantCarts$Edges$Node$Products$ProductsEdges$ProductsEdgesNode$Product$ShopMerchant> r2 = com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl.XfbShopsViewer.Cart.MerchantCarts.Edges.Node.Products.ProductsEdges.ProductsEdgesNode.Product.ShopMerchant.class
            r1 = 1345(0x541, float:1.885E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x00d9
            java.lang.String r1 = "merchant_ig_id"
            java.lang.String r1 = r2.getStringValue(r1)
            if (r1 == 0) goto L_0x00d9
            goto L_0x0074
        L_0x010f:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QK.invoke(java.lang.Object):java.lang.Object");
    }
}
