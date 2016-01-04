package fr.enst.shopping;

public interface CatalogService {
	ItemDTO findItem(Long itemId) throws CheckException;
}
