package com.cg.bean;

public abstract class Item {
			
	
		private int iid;
		private int copies;
		private String title;
		public Item() {
			// TODO Auto-generated constructor stub
		}
		public int getIid() {
			return iid;
		}
		public void setIid(int iid) {
			this.iid = iid;
		}
		public int getCopies() {
			return copies;
		}
		public void setCopies(int copies) {
			this.copies = copies;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String toString() {
			return "Item [iid=" + iid + ", copies=" + copies + ", title=" + title + "]";
		}
		public Item(int iid, int copies, String title) {
			super();
			this.iid = iid;
			this.copies = copies;
			this.title = title;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (copies != other.copies)
				return false;
			if (iid != other.iid)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
		//public abstract Item addItem(Item i);
	
}
