static int consecutive(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1] - arr[0] - (arr.length-1);
  }
