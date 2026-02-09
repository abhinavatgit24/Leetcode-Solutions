class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return build(list, 0, list.size() - 1);
    }

    void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    TreeNode build(List<Integer> list, int l, int r) {
        if (l > r) return null;

        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = build(list, l, mid - 1);
        root.right = build(list, mid + 1, r);

        return root;
    }
}
