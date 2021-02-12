package com.maltsevve.patterns.behavioral.iterator;

class AndroidPhoneBook implements PhoneBook {
    private String[] entry;

    public AndroidPhoneBook( String[] entry) {
        this.entry = entry;
    }

    public String[] getEntry() {
        return entry;
    }

    public void setEntry(String[] entry) {
        this.entry = entry;
    }

    @Override
    public PhoneBookEntryIterator getIterator() {
        return new EntryIterator();
    }

    private class EntryIterator implements PhoneBookEntryIterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < entry.length;
        }

        @Override
        public Object next() {
            return entry[index++];
        }
    }
}
