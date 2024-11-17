use reqwest;
use scraper::{Html, Selector};
use tokio;

#[tokio::main]
async fn main() -> Result<(), Box<dyn std::error::Error>> {
    // The URL to scrape
    let url = "https://www.byui.edu/financial-aid/tuition-and-cost-of-attendance";

    // Send an HTTP GET request
    let response = reqwest::get(url).await?;

    // Get response body text
    let body = response.text().await?;

    // Parse HTML document
    let document = Html::parse_document(&body);

    // CSS selector extract div.Tabs-container elements
    let selector = Selector::parse("div.Tabs-container").unwrap();

    // Iterate through elements and print text
    for element in document.select(&selector) {
        let text = element.text().collect::<Vec<_>>().join(" ");
        println!("{}", text);
    }

    Ok(())
}


