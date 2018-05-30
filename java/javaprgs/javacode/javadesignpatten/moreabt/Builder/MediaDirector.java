class MediaDirector
{
  private MediaBuilder mb;
  public MediaDirector(MediaBuilder mb) {
    this.mb = mb;
  }
  public Media produceMedia(List input) {
    mb.buildBase();
    for(Iterator it = input.iterator(); it.hasNext();)
      mb.addMediaItem((MediaItem)it.next());
    return mb.getFinishedMedia();
  }
};