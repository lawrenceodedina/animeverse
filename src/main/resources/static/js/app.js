async function searchAnime(query) {
    if (!query) {
        document.getElementById("results").innerHTML = "";
        return;
    }

    const response = await fetch(`/api/anime/search?q=${query}`);
    const data = await response.json();

    const resultsDiv = document.getElementById("results");
    resultsDiv.innerHTML = "";

    data.data.forEach(anime => {
        resultsDiv.innerHTML += `
            <div class="card">
                <h3>${anime.title}</h3>
                <p>Score: ${anime.score ?? "N/A"}</p>
                <img src="${anime.images.jpg.image_url}" width="120"/>
            </div>
        `;
    });
}

document.addEventListener("DOMContentLoaded", () => {
    const searchBox = document.getElementById("searchBox");

    searchBox.addEventListener("input", (e) => {
        searchAnime(e.target.value);
    });
});